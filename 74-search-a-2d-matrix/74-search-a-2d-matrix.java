class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m= matrix.length;
        int n= matrix[0].length;
         
        for(int r=0;r<m;r++)
        {
            if(target>=matrix[r][0] && target<=matrix[r][n-1])
            {
                if(Arrays.binarySearch(matrix[r],target)>=0)
                    return true;
            }
        }
        
        return false;
    }
}