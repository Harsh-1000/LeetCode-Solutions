class Solution {
    
    class charCount
    {
        char c;
        int count;
        
        charCount(char c)
        {
            this.c = c;
            count=1;
        }
        
        public int getCount()
        {
            return count;
        }
        
        public char getChar()
        {
            return c;
        }
        
        public void setCount()
        {
            count++;
        }
        
        public String setString()
        {
            String res ="";
            for(int i=0;i<count;i++)
                res+=c;
            
            return res;
        }
    }
    
    
    public String removeDuplicates(String s, int k) {
        
        Stack< charCount > st = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if(st.isEmpty() || st.peek().getChar()!=c)
                st.push(new charCount(c));
            
            else if(st.peek().getCount()!=k-1)
                st.peek().setCount();
            
            else
            st.pop();
            
                
        }
        
         StringBuilder str = new StringBuilder("");
        
        while(!st.isEmpty())
        {
          
            
            str.append(st.pop().setString());
            
        }
        
       
        String result = new String(str.reverse());
        return result;
        
    }
    
}