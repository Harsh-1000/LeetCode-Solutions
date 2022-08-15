class Solution {
    public int lengthOfLastWord(String s) {
        
        StringBuffer cur_word = new StringBuffer("");
       
        
        for(int i=s.length()-1; i>=0;i--)
        {
            if(s.charAt(i)!=' ')
                cur_word.append(s.charAt(i));
            
            else
            {
                if(cur_word.length()!=0)
                    return cur_word.length();
            }
        }
        
        return cur_word.length();
        
    }
}