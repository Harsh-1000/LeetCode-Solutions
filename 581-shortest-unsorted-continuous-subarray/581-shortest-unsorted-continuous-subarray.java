class Solution {
    
       
    
    private int[] minMax(int[] a)
    {
        
        int[] res = new int[2];
       
        res[0]=Integer.MAX_VALUE;
        
        res[1]=Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<res[0])
                res[0]=a[i];
            
            if(a[i]>res[1])
                res[1]=a[i];
        }
        
        return res;
   }
    
    public int findUnsortedSubarray(int[] nums) {
        
    
        
        
        int start = 0;
        int end = nums.length;
        int[] res = new int[2];
        

        while(start<end)
        {
            int[] a = Arrays.copyOfRange(nums,start,end);
            
        
            
            res = minMax(a);
                
        
            
            if(res[0]!=a[0] && res[1]!=a[a.length-1])
                return end-start;
            
            else if(res[0]==a[0] && res[1]!=a[a.length-1])
                   start++;
            
            else if(res[0]!=a[0] && res[1]==a[a.length-1])
                   end--;
            else
                 {    
                  start++;
                  end--;
                  }
            
        }
        
        return 0;
        
        
        
    }
}