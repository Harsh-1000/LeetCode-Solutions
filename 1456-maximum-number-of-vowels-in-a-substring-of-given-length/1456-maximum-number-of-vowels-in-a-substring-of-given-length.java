class Solution {
    
    private boolean isVowel(char ch)
    {
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
              return true;
           
          return false;
    }
    
    public int maxVowels(String s, int k) {
        
        int ans = 0;
        int count = 0;
        int start = 0;
        int end = 0;
        
        while(end<s.length())
        {
            if(isVowel(s.charAt(end))) 
                 count++;
            
            if(end-start+1==k)
            {
                ans = Math.max(count,ans);
                
                if(isVowel(s.charAt(start)))
                    count--;
                
                start++;
            }
            
            end++;
        }
        
        return ans;
        
    }
}
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        