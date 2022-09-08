class Solution {
    public int[][] generateMatrix(int n) {
        
        
        int minr = 0;
        int maxr = n-1;
        
        int minc = 0;
        int maxc = n-1;
        
        int[][] spiral = new int[n][n];
        
        int count  = 1;
        int l = n*n+1;
        while(count<l)
        {
            for(int i = minc ; i<= maxc;i++)
            {
                spiral[minr][i] = count;
                count++;
            
            }
            
            minr++;
            
            for(int i=minr;i<=maxr;i++)
            {
                spiral[i][maxc] = count;
                count++;
            
            }
            
            maxc--;
            
            for(int i=maxc;i>=minc;i--)
            {
                spiral[maxr][i] = count;
                count++;
    
            }
        
            maxr--;
            
            for(int i=maxr;i>=minr;i--)
            {
                spiral[i][minc] = count;
                count++;

            }
              
            minc++;
        }
        
        return spiral;
    }
}