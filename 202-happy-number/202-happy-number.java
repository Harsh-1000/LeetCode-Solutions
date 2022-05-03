class Solution {
    
    private int numSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r = n%10;
            sum+=r*r;
            n=n/10;
        }
        
        return sum;
        
    }
    
    
    public boolean isHappy(int n) {
        
        HashSet<Integer> seen = new HashSet<>();
        
        seen.add(n);
        
        while(n!=1)
        {
            n=numSum(n);
            
            if(seen.contains(n))
                return false;
            
            else
                seen.add(n);
            
        }
        
        return true;
        
        
    }
}