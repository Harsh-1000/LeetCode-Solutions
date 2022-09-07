class Solution {
    public void rotate(int[][] matrix) {
        
      for(int i=0;i<matrix.length;i++)
      {
          for(int j=i+1;j<matrix[0].length;j++)
          {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
          }
      }
        
      for(int i=0;i<matrix.length;i++)
      {
          int start = 0;
          int end = matrix[0].length-1;
          
           while (start < end) {
  
            // Swap the element
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
  
            // Increment start and decrement
            // end for next pair of swapping
            start++;
            end--;
        }
                     
      }
        
    }
}