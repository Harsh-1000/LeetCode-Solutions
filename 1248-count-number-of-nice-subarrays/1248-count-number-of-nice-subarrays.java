class Solution {
    
    private int atMost(int[] nums, int goal)
    {
        if(goal<0)
            return 0;
        
        int end=0;
        int start=0;
        int count=0;
        int sum=0;
        
        while(end<nums.length)
        {
            if(nums[end]==1)
                count++;
            
            
                while(count>goal)
                {
                    if(nums[start]==1)
                        count--;
                    
                     start++;
                }
            
            
            sum += end-start+1;
            end++;
        }
        
        return sum;   
    }
    
    public int numberOfSubarrays(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                nums[i]=0;
            else
                nums[i]=1;
        }
        
       return atMost(nums,k)-atMost(nums,k-1);
    }
}