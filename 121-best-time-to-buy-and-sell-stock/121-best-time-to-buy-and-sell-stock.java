class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int b=prices[0];
        
        for(int i=1;i<prices.length;i++)
        {
            
         if(prices[i]<b) b=prices[i];
            
         if(prices[i]-b>profit) profit=prices[i]-b;
        
        }
        
        return profit;
    }
}