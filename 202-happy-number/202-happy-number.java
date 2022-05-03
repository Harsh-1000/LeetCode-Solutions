class Solution {
    

    
    
    public boolean isHappy(int n) {
        
        HashSet<Integer> seen = new HashSet<>();
        
        seen.add(n);
        
        while(n!=1)
        {
            int sum=0;
        while(n>0)
        {
            int r = n%10;
            sum+=r*r;
            n=n/10;
        }
        n=sum;
            
            if(seen.contains(n))
                return false;
            
            else
                seen.add(n);
            
        }
        
        return true;
        
        
    }
}