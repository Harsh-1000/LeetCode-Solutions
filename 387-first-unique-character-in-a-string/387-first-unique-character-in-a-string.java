class Solution {
    public int firstUniqChar(String s) {
        
        int res = Integer.MAX_VALUE;
        
        int index =-1;
        
        for(char c='a'; c<='z';c++)
        {
            index = s.indexOf(c);
            
            if(index!=-1 && index == s.lastIndexOf(c))
            {
                res=Math.min(res,index);
            }
        }
        
        if(res==Integer.MAX_VALUE)
            return -1;
        
        return res;
        
    }
}