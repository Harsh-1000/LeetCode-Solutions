class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        
        ArrayList<String> list = new ArrayList<>();
        
        if(s.length()<10)
            return list;
    
    
        HashSet<String> set =  new HashSet<>();
         HashSet<String> res =  new HashSet<>();
        
        int si=0;
        int ei=0;
        String str = new String();
        
        while(ei<s.length())
        {
            str += s.charAt(ei);
            
            if(ei-si+1==10)
            {
               
                if(!set.add(str))
                {
                    res.add(str);
                }
                
                si++;
                str=s.substring(si,ei+1);
                
         
            }
            ei++;    
        }
        
        
        
        return new ArrayList<>(res);
        
    }
}