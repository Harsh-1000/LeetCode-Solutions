class Solution {
    
    public int helper(int count, int i, String s, String[] words, HashMap memo)
    {
        
        if(i>words.length-1)
            return count;
        
        String st = words[i];    
        int x=0;
        int z=0;
        
        if(st.length()==0)
        {
            count++;
            
            return helper(count,i+1,s,words,memo);
        
            
        }
        
        else if(memo.containsKey(st))
        {
             
              if( 1 == (int)memo.get(st))
              {    count++;
              }
            
               return helper(count,i+1,s,words,memo);
     
        }
        
        
        else 
        {
        
            while(x<s.length() && z<st.length())
            {
                if(st.charAt(z)==s.charAt(x))
                    {
                         z++;
                    }
            
                x++;    
            }
        
            if(z==st.length())
            {        count++;  
                     memo.put(st,1);
            }
            
            else
            {
                memo.put(st,0);
            }
             
            
            return helper(count,i+1,s,words,memo);
            
        }
        
            
    }
        
    public int numMatchingSubseq(String s, String[] words) {
        
        int count=0;
        
        HashMap<String,Integer> memo = new HashMap<>();
        
        
        
        return helper(count,0,s,words,memo);
        
        
        
    }    
}