class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int x=0;
        int z=0;
        
        if(s.length()==0)
            return true;
        
        while(x<t.length() && z<s.length())
        {
            if(s.charAt(z)==t.charAt(x))
            {
                z++;
            }
            
            x++;    
        }
        
        if(z==s.length())
            return true;
        else
            return false;
      
        
        
    }
}