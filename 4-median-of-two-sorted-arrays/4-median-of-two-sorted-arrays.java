class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i=0,j=0,k=0;
        
        int[] res = new int[nums1.length + nums2.length];
        
        while(i<nums1.length && j<nums2.length)
        {
            
            if(nums1[i]<=nums2[j])
            {
                res[k]=nums1[i];
                i++; 
            }
            else
            {
                res[k]=nums2[j];
                j++;
            }
            
            k++;
            
        }
        
        while(i<nums1.length)
        {
            res[k]=nums1[i];
            k++;
            i++;
        }
        
        
        while(j<nums2.length)
        { 
            
            res[k]=nums2[j];   
            k++;
            j++;
        }
        
        if(res.length%2!=0)
        {
            return res[res.length/2];
        }
        
        else
        { 
            double a = res[res.length/2];
            double b = res[(res.length/2) - 1];
            return (a+b)/2;
        }
    }
}