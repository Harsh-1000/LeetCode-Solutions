class Solution {
    public boolean isPalindrome(int x) {
        
        
        String str = Integer.toString(x);
        
        int s = 0;
        int e = str.length()-1;
        
        while(s<e)
        {
            if(str.charAt(s)!=str.charAt(e))
                return false;
            
            s++;
            e--;
        }
        
        return true;
    }
}