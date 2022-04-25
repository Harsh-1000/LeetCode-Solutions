class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char b =s.charAt(i);
            
            if(st.isEmpty())
                st.push(b);
            
            else
            {
              char c = st.peek();
                
              if(c=='(' && b==')')
                    st.pop();
                
              else  if(c=='[' && b==']')
                    st.pop();
                
              else  if(c=='{' && b=='}')
                    st.pop();    
                
              else
                  
                  st.push(b);
            }
        }
        
        if(st.isEmpty())
            return true;
        else
            return false;
        
    }
}