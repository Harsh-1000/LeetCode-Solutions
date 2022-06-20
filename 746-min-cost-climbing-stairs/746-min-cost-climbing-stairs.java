class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        
        int[] memo = new int[cost.length];
        
        memo[0]=cost[0];
        memo[1]=cost[1]; 
        
        for(int i=2;i<cost.length;i++)
        {
            memo[i]= cost[i] + Math.min(memo[i-1] , memo[i-2]);
            
        }
        
        
        
        return Math.min(memo[cost.length-1], memo[cost.length-2]);
    }
}