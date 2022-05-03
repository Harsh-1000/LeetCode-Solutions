class Solution {
    
    private int signCheck(int num)
    {
        if(num>0)
            return 1;
        else if(num<0)
            return -1;
        
        return 0;
    }
    
    
    
    
    public int arraySign(int[] nums) {
        
        
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int x=signCheck(nums[i]);
            
            if(x==-1)
                count++;
            if(x==0)
                return 0;
        }
        
        if(count%2==0)
            return 1;
        else
            return -1;
        
        
        
    }
}