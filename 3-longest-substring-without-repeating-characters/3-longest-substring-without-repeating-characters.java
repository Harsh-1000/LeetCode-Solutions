class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
        
        int si = 0;
        int ei = 0;
        int ans = 0;
        boolean repeat = false;
        
        int[] freq = new int[256];
        
        while(ei<s.length())
        {
            //window grow
            
            char ch = s.charAt(ei);
            
            freq[ch]++;
            
            if(freq[ch]>1)
                repeat=true;
            
            // window shrink
            
            while(repeat)
            {
                char ch2 = s.charAt(si);
                
          
                
                if(freq[ch2]>1)
                {
                    freq[ch2]--; 
                    repeat=false;
                }
                
                else
                   freq[ch2]--; 
                   
                
                si++;
                
            }
            
            //ans calculation
            
            ans = Math.max(ans,ei-si+1);
            
            ei++;
            
        }
        
        return ans;
        
        
    }
}