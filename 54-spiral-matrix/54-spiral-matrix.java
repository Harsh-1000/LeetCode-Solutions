class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();

        int minr = 0;
        int maxr = matrix.length-1;
        
        int minc=0;
        int maxc=matrix[0].length-1;
        
        int count = matrix.length * matrix[0].length;
        
        while(count>0)
        {

        
        for(int i=minc;i<=maxc && count>0;i++)
        {
             list.add(matrix[minr][i]);
             count--;
        }
           
        
        minr++;
        
        for(int i=minr;i<=maxr && count>0;i++)
        {
             list.add(matrix[i][maxc]);
             count--;
        }
            
        
        maxc--;
        
        for(int i=maxc;i>=minc && count>0;i--)
        {
            list.add(matrix[maxr][i]);
            count--;
        }
        
        maxr--;
        
        for(int i=maxr;i>=minr && count>0;i--)
        {
            list.add(matrix[i][minc]);
            count--;
        }
        
        minc++;
              
        }
        
        return list;
    }
}