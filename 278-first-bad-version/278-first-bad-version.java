/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int first=1;
        int last=n;
        int ans=0; 
        
        while(first<=last)
        {
          int  mid  = (last-first)/2 + first;
            
            if(isBadVersion(mid)==true ){
                ans=mid;
                last = mid-1;
            }
            
            
            else 
                first = mid +1;
                
        }
        
        return ans;
        
    }
}