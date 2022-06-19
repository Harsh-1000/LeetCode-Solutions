class Solution {
    
    private static int help(int n, int[] memo)
    {
        
        if(n==0) return 0;
        if(n==1) return 1;
        
        if(memo[n-1]!=-1)
            return memo[n-1];
        
         memo[n-1] =  help(n-1,memo) + help(n-2,memo);
         return memo[n-1];
    }
    
    public int fib(int n) 
    {
        
      int[] memo = new int[n];
        
      for(int i=0;i<n;i++)
          memo[i]=-1;
      
      return help(n,memo);  
    
    }
}