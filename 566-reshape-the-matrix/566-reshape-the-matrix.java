class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        
        int m=mat.length;
        int n=mat[0].length;
        
        
        if(r*c!=m*n || (m==r && n==c))
            return mat;
        
        int[][] res = new int[r][c];
        int rowRes=0;
        int colRes=0;
        
        for(int rowMat = 0;rowMat<m;rowMat++)
        {
            for(int colMat = 0; colMat<n;colMat++)
            {
                if(colRes<c)
                    res[rowRes][colRes]=mat[rowMat][colMat];
                else{
                    rowRes++;
                    colRes=0;
                    
                   res[rowRes][colRes]=mat[rowMat][colMat];}
                
                colRes++;
                
            }
        }
        
        return res;
            
        
    }
}