class Solution {
    public int[] plusOne(int[] nums) {
        
        
        
        Stack<Integer> st=new Stack<>();
        
        int carry=1;
        int i=nums.length-1;
                
        while(i>=0)
        {
            if(carry==1)
            {
                if(nums[i]==9 && i==0)
                { 
                    carry=0;
                    st.add(0);
                    st.add(1);
                } 
                
                else if(nums[i]==9 && i!=0)
                {
                    carry=1;
                    st.add(0);
                    
                }
                else
                {
                    st.add(nums[i]+1);
                    carry=0;
                }
                
            }
            
            else
            {
                st.add(nums[i]);
            }
            
            i--;
        }
        
        int[] res = new int[st.size()];
        int k=0;
        while(!st.isEmpty())
        {
           res[k]=st.pop();
            k++;
        }
        
        return res;
    }
}