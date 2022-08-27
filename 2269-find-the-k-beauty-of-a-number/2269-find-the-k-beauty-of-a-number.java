class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String s = Integer.toString(num);
        
        int start=0,end=0,count=0;
        
        StringBuilder str = new StringBuilder("");
        
        while(end<s.length())
        {
            str.append(s.charAt(end));
            
            if(end-start+1==k)
            {
                
                int div = Integer.parseInt(new String(str));
                
                if(div!=0 && num%div==0)
                    count++;
                
                str.deleteCharAt(0);
    
                start++;
                end++;
                
            }
            
            else
                end++;      
        }
        
        
        return count;
    }
}