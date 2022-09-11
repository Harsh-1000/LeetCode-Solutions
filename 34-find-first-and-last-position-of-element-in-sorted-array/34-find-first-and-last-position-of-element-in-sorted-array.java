class Solution {
    
    private int leftMost(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        int left = -1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target)
            {
                left=mid;
                end = mid - 1;
            }
               
            
            else if(nums[mid]>target)
                end = mid -1;
            
            else
                start = mid + 1;
        }
        
        return left;
    }
    
     private int rightMost(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        int right = -1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target)
            {
                right=mid;
                start = mid + 1;
            }
               
            
            else if(nums[mid]>target)
                end = mid -1;
            
            else
                start = mid + 1;
        }
        
        return right;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        
        res[0] = leftMost(nums,target);
        res[1] = rightMost(nums,target);
        
        return res;
        
    }
}