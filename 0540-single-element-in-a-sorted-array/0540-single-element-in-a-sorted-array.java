class Solution {
    
    private int rightMost(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if(nums[mid]<=target)
                low = mid + 1;
            
            else
                high = mid - 1;
        }
        
        return high;
    }
    
    private int leftMost(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if(nums[mid]>=target)
                high = mid - 1;
            
            else
                low = mid + 1;
        }
        
        return low;
    }
    
    
    public int singleNonDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            int count = rightMost(nums,nums[i]) - leftMost(nums,nums[i]);
            
            if(count==0)
                return nums[i];
        }
        
        return -1;
        
    }
}