class Solution {
    public int searchInsert(int[] nums, int target) {
     
        int start=0;
        int end = nums.length-1;
        int mid=0;
        int flag=1;
        
        while(start<=end)
        {
            mid = (start+end)/2;
            
            if(nums[mid]==target)
            {
                flag=0;
                break;
            }
            
            else if(nums[mid]>target)  end=mid-1;
            
            else start=mid+1;
            
        }
        
        if(flag!=0)
        {
            for(int i=0;i<nums.length;i++)
                if(target<nums[i])
                    return i;
            return nums.length;
        }
        
            return mid;
        
      
        
        
    }
}