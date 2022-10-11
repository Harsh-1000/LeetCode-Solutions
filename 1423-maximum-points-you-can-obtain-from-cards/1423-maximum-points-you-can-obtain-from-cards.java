class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum=0;
        int maxSum=0;
        int start=0;
        int end=cardPoints.length-1;
        
        for(int i=0;i<k;i++)
        {
            sum += cardPoints[i];
        }
        
        maxSum=sum;
        
        while(k>0)
        {
            sum -= cardPoints[k-1];
            sum += cardPoints[end];
            
            maxSum = Math.max(sum,maxSum);
            
            end--;
            k--;
        }
        
        return maxSum;
        
    }
}