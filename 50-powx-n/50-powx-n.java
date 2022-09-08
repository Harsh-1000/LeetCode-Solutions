class Solution {
    

    public double myPow(double x, int n) {
      
     double ans=1.0;   
     int num =n;   
     
     
     while(num!=0)
     {
         if(num%2==0)
         {
             x=x*x;
             num=num/2;
         }
         else
         {
             ans = ans*x;
             if(num>0)
               num=num-1;
             else
               num = num+1;  
         }
     }
        
     if(n<0)
         return 1/ans;
     else
         return ans;
        
        
     
            
    }
}