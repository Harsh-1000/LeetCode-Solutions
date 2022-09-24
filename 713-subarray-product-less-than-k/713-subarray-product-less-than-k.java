class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int si = 0;
        int ei = 0;
        
        int product = 1;
        
        int ans =0;
        
        while(ei<nums.length)
        {
            
            // grow window
            
            product *= nums[ei];
            
            // shrink window
            
            while(product>=k && si<=ei)
            {
                product /= nums[si];
                
                si++;
            }
            
            //calculation
            
            ans += ei-si+1;  // adding window size
                
            ei++;     
        }
        
        return ans;
        
    }
}