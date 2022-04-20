class Solution {
    public int maximumDifference(int[] nums) {
        
        int max=0;
        int b=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            
         if(nums[i]<b) b=nums[i];
            
         if(nums[i]-b>max) max=nums[i]-b;
        
        }
        
        if(max==0) return -1;
        else
            return max;
    }
}