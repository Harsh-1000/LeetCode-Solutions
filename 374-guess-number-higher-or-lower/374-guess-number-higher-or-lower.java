/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    
    
    public int guessNumber(int n) {
        
        int start=1;
        int end=n;
        int mid=1;
        
        while(start<=end)
        {
            mid= start+(end-start)/2;
            
            int k= guess(mid);
            
            if(k==0)
                break;
            
            else if(k==1)
            {
                start=mid+1;
            }
            
            else
            {
                end=mid-1;
            }
            
            
        }
        
        return mid;
        
    }
}