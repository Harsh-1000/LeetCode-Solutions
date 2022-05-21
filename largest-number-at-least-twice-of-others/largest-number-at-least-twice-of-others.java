class Solution {
    public int dominantIndex(int[] nums) {
        
        if(nums.length==1)
            return 0;
        
        int max=Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int k=0;
        int j=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                j=i;
            }
        }
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(max2<nums[i] && nums[i]!=max)
            {
                max2=nums[i];
                k=i;
            }
        }
        
        
        if(max>=2*max2)
            return j;
        else
            return -1;
        
    }
}