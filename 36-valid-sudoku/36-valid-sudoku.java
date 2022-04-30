class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> row = new HashSet();
        for(int i=0;i<9;i++){
           for(int j =0;j<9;j++) {
               if(row.contains(board[i][j]) && board[i][j]!='.')
                   return false;
               row.add(board[i][j]);
           }
            row.clear();
        }
        HashSet<Character> column = new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(column.contains(board[j][i]) && board[j][i]!='.')
                    return false;
                column.add(board[j][i]);
            }
            column.clear();
        }
        HashSet<Character> subBox = new HashSet();
        for(int i =0;i<9;i=i+3){
            for(int j =0;j<9;j=j+3){
                
                for(int k =i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(subBox.contains(board[k][l]) && board[k][l]!='.')
                            return false;
                        subBox.add(board[k][l]);
                    }
                }
                subBox.clear();
            }           
        }
        return true;
        
        
    }
}