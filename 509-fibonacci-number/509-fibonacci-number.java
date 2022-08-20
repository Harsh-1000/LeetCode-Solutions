class Solution {
    public int fib(int n) {
        
        int a = 0;
        
        int b = 1;
        
        while(n>0)
        {
            int c = a+b;
            a=b;
            b=c;
            n--;
        }
        
        return a;
    }
}