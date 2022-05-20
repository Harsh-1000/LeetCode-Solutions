class Solution {
    public int pivotIndex(int[] nums) {
        
        
        int res=-1;
        
        
        
        for(int i=0;i<nums.length;i++)
        {
            int leftSum=0;
            int rightSum=0;
            
            for(int j=0;j<i;j++)
                leftSum+=nums[j];
            
            for(int k=nums.length-1;k>i;k--)
                rightSum+=nums[k];
            
            if(leftSum==rightSum)
            {
                
                res=i;
                break;
            }
               
        }
        
        return res;
        
    }
}