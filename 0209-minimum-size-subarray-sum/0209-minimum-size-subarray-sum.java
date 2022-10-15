class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int start=0;
        int end=0;
        
        int ans=nums.length;
        int sum=0;
        boolean check=false;
        
        while(end<nums.length)
        {
            sum += nums[end];
            
            while(sum>=target)
            {
                check=true;
                ans=Math.min(ans,end-start+1);
                
                sum -= nums[start];
                
                start++;
            }
            
            end++;
        }
        
        if(check)
            return ans;
        
        return 0;
    }
}