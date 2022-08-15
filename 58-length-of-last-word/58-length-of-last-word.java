class Solution {
    public int lengthOfLastWord(String s) {
        
        StringBuffer cur_word = new StringBuffer("");
        StringBuffer last_word = new StringBuffer("");
        
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(cur_word.length()!=0)
                         last_word=cur_word;

                cur_word= new StringBuffer("");
            }
            
            else
                cur_word.append(s.charAt(i));
        }
        
      
        
        if(cur_word.length()==0)
            return last_word.length();
        else
            return cur_word.length();
    }
}