class Solution {
    public long countVowels(String word) {
        long n = word.length() ;
        long result = 0 ;
        
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i) ;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                result += (i+1)*(n-i) ;
        }
        
        return result ;
    }
}