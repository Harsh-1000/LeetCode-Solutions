class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int[] freq = new int[k];
        
        int sum=0;
        
        int ans=0;
        
        freq[0] = 1;
        
        for(int i=0;i<nums.length;i++)
        {
           sum += nums[i];
            
           int indx = sum %k;
            
           if(indx<0)
               indx += k;
            
            freq[indx]++;
            
        }
        
        for(int i=0;i<k;i++)
        {
            if(freq[i]>1)
                ans += (freq[i] * (freq[i]-1))/2;
        }
        
        return ans;
    }
}