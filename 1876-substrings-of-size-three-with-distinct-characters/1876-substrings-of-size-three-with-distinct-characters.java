class Solution {
    public int countGoodSubstrings(String s) {
        
        // Approach - 1
        
        //  int i = 2, count = 0;
        // while(i < s.length())
        // {
        //     char last = s.charAt(i), middle = s.charAt(i-1), first = s.charAt(i-2);
        //     count += (last != middle && middle != first && first != last) ? 1 : 0;
        //     i++;
        // }
        
        int count=0,start=0,end=0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(end<s.length())
        {
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            
            if(end-start+1==3)
            {
                if(map.size()==3)
                    count++;
                
                end++;
                if(map.get(s.charAt(start))==1)
                    map.remove(s.charAt(start));
                else
                    map.put(s.charAt(start),map.get(s.charAt(start))-1);
                
                start++;    
            }
            
            else
                end++;
        }
        
        
        
        return count;
    }
}