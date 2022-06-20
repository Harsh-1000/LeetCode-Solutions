class Solution {
    
    private static int help(int n, int sum ,int[] cost, int[] memo)
    
    {
        
        
         if(n>cost.length)
        {
            return 0;
        }
        
        
        if(n==cost.length-1 || n==cost.length-2)
        {
            sum+=cost[n];
            return sum;
        }
        
        if(memo[n]!=-1)
            return memo[n];
        
  
        sum+=Math.min(help(n+1,sum,cost,memo),help(n+2,sum,cost,memo));
        sum+=cost[n];
        
        memo[n] = sum;
        
        return memo[n];
        
    }
    
    
    public int minCostClimbingStairs(int[] cost) {
        
        int[] memo = new int[cost.length];
        
        for(int i=0;i<cost.length;i++)
            memo[i]=-1;
        
        
        int step1= help(0,0,cost,memo);
        int step2= help(1,0,cost,memo);
        
        return Math.min(step1,step2);
 
        
    }
}