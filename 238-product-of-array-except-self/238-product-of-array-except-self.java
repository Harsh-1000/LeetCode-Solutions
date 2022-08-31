class Solution {
    public int[] productExceptSelf(int[] nums) {
        
   
        int n = nums.length;
        
        int[] lmt =  new int[n];
        int[] rmt = new int[n];
        
        lmt[0]=1;
        
        rmt[n-1] = 1;  
        
        for(int i=1;i<n;i++)
           lmt[i] = lmt[i-1] * nums[i-1];
        
        
        
        for(int i=n-2;i>=0;i--)
            rmt[i] = rmt[i+1] * nums[i+1];
        
        int[] answer = new int[n];
        
        for(int i=0;i<n;i++)
            answer[i] = lmt[i]*rmt[i];
        
        return answer;
    }
}