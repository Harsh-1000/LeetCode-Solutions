class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        
        for(int i = 0 ;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1] && l>nums[i+1])
                l=nums[i+1];         
        }
        
        for(int i = nums.length-1 ;i>0 ; i--)
        {
            if(nums[i-1]>nums[i] && r<nums[i-1])
                r=nums[i-1];
        }
        
        
        if(l==Integer.MAX_VALUE && r ==Integer.MIN_VALUE)
            return 0;
        
        for(int i=0; i<nums.length;i++)
        {
            if(l<nums[i])
            {   l=i;   
              break;
            }
        }
        
        for(int i=nums.length-1 ;i>=0;i--)
        {
            if(r>nums[i])
            {
                r=i;
                break;
            }
        }
        
        return r-l+1;
        
    }
}