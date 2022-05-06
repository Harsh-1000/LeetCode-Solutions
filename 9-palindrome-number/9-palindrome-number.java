class Solution {
    public boolean isPalindrome(int x) {
        
        
        int n=x;
        int sum=0;
        while(n>0)
        {
            int r = n % 10;
            n=n/10;
            
            sum = sum*10 + r;
            
        }
        
        return sum==x;
    }
}