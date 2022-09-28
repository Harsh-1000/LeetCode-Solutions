class Solution {
    public int numberOfSubstrings(String s) {
        
        int si=0;
        int ei=0;
        int res = 0;
        int n = s.length();
        
        int[] freq = new int[3];
        
        while(ei<n)
        {
            freq[s.charAt(ei)-'a']++;
            
            while(freq[0]>0 && freq[1]>0 && freq[2]>0 )
            {
                res += n - ei;
                
                freq[s.charAt(si)-'a']--;
                si++;
            }
            
            ei++;
        }
        
        return res;
        
    }
}