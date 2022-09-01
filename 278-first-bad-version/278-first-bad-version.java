/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int first=1;
        int last=n;
    
        
        while(first<=last)
        {
          int  mid  = (last-first)/2 + first;
            
            if(isBadVersion(mid)==true && isBadVersion(mid-1) ==false)
                return mid;
            
            
            else if(isBadVersion(mid)  == false)
                first = mid +1;
            

            else
                last = mid -1;
            
        }
        
        return -1;
        
    }
}