class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        
         Arrays.sort(properties,(A,B)->(B[0]==A[0]?A[1]-B[1]:B[0]-A[0]));
        
//         for(int i=0;i<properties.length;i++)
//         {
//             for(int j=0;j<properties[0].length;j++)
//             {
//                 System.out.print(properties[i][j] + " ");
//             }
            
//             System.out.println();
//         }
        
        int max_def = 0;
        int count=0;
        
        for(int i=0;i<properties.length;i++)
        {
            if(properties[i][1]<max_def)
                count++;
            
            max_def = Math.max(max_def,properties[i][1]);
            
        }
        
        return count;
        
        
    }
}