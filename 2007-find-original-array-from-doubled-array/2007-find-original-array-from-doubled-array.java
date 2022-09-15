class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        if(changed.length%2!=0)
             return new int[0];
        
        int max=0;
        int n = changed.length;
        
        for(int x: changed)
        {
            max = Math.max(max,x);
        }
        
        int[] fre = new int[max+1];
        
        for(int i=0;i<n;i++)
        {
            fre[changed[i]]++;
        }
        
        if(fre[0]%2!=0)
            return new int[0];
        
        int[] res = new int[n/2];
        
        int k=fre[0]/2;
        
        
        for(int i=1;i<max+1;i++)
        {
            
            if(fre[i]==0)
                 continue;
            
            if(i*2 > max || fre[i]>fre[i*2])
                return new int[0];
            
            fre[i*2] -= fre[i];
            while(fre[i]-- > 0)
                res[k++] = i;
        }
        
  
        
    
        
        return res;
        
        
        
         
        
    }
}