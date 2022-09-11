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
    
    public int singleNonDuplicate(int[] nums) {
        
        int i=0;
        int count=0;
        
        while(i<nums.length)
        {
            count =0;
            
            int left = leftMost(nums,nums[i]);
            int right = rightMost(nums,nums[i]);
            
            count = right-left+1;
            
            if(count==1)
                break;
            
            i=i+2;
        }
        
        return nums[i];
        
    }
}