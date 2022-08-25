class Solution {
    
    private static void rotate(int[] nums , int start , int end)
    {
        while(start<end)
        {
             // nums[start] = nums[start] + nums[end];
             // nums[end] = nums[start] - nums[end];
             // nums[start] = nums[start] - nums[end];
            
            int a = nums[start];
            nums[start] = nums[end];
            nums[end] = a;
            
             start++;
             end--;
        }
    }
        
    public void rotate(int[] nums, int k) 
    {
        
       
            k = k % (nums.length);
            
            rotate(nums,nums.length-k,nums.length-1);
            rotate(nums,0,nums.length-k-1);
            rotate(nums,0,nums.length-1);
        
        
        
    }
}