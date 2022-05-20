class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        
        int mid=(nums.length)/2;
        
        for(int i=0;i<mid;i++)
        {
            if(nums[i]>nums[mid])
                mid=i;
        }
        
         for(int i=mid+1;i<nums.length;i++)
        {
            if(nums[i]>nums[mid])
                mid=i;
        }
        
        return mid;
        
    }
}