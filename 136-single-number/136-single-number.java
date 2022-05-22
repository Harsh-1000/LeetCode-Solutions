class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        Stack<Integer> st = new Stack<>();
        

        
        for(int i=0;i<nums.length;i++)
        {
    
            if(!st.isEmpty())
            {
      
                  if(st.peek()==nums[i]) st.pop();
            
                  else  st.add(nums[i]);
            }
            
            
            else
            {
                st.add(nums[i]);
            }
            
            
        }
        
        return st.pop();
        
    }
}