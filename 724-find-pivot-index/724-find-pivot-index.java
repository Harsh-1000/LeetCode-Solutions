class Solution {
    public int pivotIndex(int[] nums) 
    {
        
        int l=0;
        int r=nums.length-1;
        
        int sl = 0;
        int sr = 0;
        
        int total=0; 
        
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            sr = total - nums[i] - sl;
            
            if(sr==sl)
                return i;
            
            sl += nums[i];
        }
        
         return -1;
        
    }
}