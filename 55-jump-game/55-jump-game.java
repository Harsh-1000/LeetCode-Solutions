class Solution {
    public boolean canJump(int[] nums) 
    {
        
        if(nums.length==0)
            return false;
    
        
        boolean[] dp = new boolean[nums.length];
    
         
        dp[0]=true;
    
        for(int i=0;i<nums.length-1;i++)
        {
            
            for(int j=1;j<=nums[i];j++)
            {
                if((i+j)>nums.length-1)
                    break;
                dp[i+j] = dp[i] | dp[i+j];  
            }
       }
        
        return dp[nums.length-1];
}
}