class Solution {
    

    HashMap<Integer,Integer> memo = new HashMap<>();
    
    
    private int helper(int[] num, int target)
    {
        
        
        if(target==0)
        {
           
           return 1;
        }
        
        if(target<0)
            return 0;
        
        if(memo.containsKey(target))
            return memo.get(target);
        
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
          
           sum = sum + helper(num,target-num[i]);
            
        }
        
        memo.put(target,sum);
        return sum;
        
    }
    
    public int combinationSum4(int[] nums, int target) {
        
        
       return helper(nums,target);
        
        
        
    }
}