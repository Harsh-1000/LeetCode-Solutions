class Solution {
    public int minimumCardPickup(int[] cards) {
        
        int end =0;
        int start=0;
        boolean sameCard=false;
        int[] nums = new int[1000001];
        int res=Integer.MAX_VALUE;
        
        
        while(end<cards.length)
        {
            nums[cards[end]]++;
            
            if(nums[cards[end]]==2)
            {
                 res = Math.min(end-start+1,res);
                 sameCard=true;
            }
               
            
           
            
            while(sameCard)
            {
                if(nums[cards[start]]==2)
                {
                    nums[cards[start]]--;
                    sameCard=false;
                    start++;
                }
                else
                {
                     nums[cards[start]]--;   
                     start++;
                     res = Math.min(end-start+1,res);
                }
                 
              
            }
                
            end++;
                
        }
        
        if(res!=Integer.MAX_VALUE)
           return res;
        
        return -1;
        
    }
}