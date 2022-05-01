class Solution {
    
    
    private String update(String str)
    {
        
        StringBuilder s = new StringBuilder("");
        
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)!='#')
                s.append(str.charAt(i));
            
            else if(s.length()!=0)
                s.deleteCharAt(s.length()-1);
            
        }
        
        String st = new String(s);
        
        return st;
    }
    
    public boolean backspaceCompare(String s, String t) {
        
        s = update(s);
        t = update(t);
        
        return s.equals(t);
        
        
    }
}