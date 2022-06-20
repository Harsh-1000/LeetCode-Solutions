class Solution {
    
    private int help(int n, int[] memo)
    {
         
        if(n==0)
            return 1;
        
        if(n<0)
            return 0;
        
        if(memo[n-1]!=-1)
            return memo[n-1];
        
        memo[n-1] = help(n-2,memo) + help(n-1,memo);
        return memo[n-1];
    }
    
    public int climbStairs(int n) {
        
        int[] memo = new int[n];
        
        for(int i=0;i<n;i++)
            memo[i]=-1;
        
        return help(n,memo);
       
    }
}