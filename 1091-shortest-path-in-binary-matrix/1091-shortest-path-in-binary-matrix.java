class Solution {
    private int[][] dir = new int[][]{{0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}, {-1,-1}, {-1,0}, {-1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        if(grid[m-1][n-1]==1 || grid[0][0]==1) return -1;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int top[]=q.poll();
                
                if(top[0]==m-1 && top[1]==n-1) 
                    return ans+1;
                
                for(int j=0;j<8;j++){
                    int x=dir[j][0] + top[0];
                    int y=dir[j][1] + top[1];
                    if(x>=0 && x<m && y>=0 && y<m && grid[x][y]==0){
                        grid[x][y]=1;
                        q.offer(new int[]{x, y});
                    }
                }
            }
            ans++;
        }
        
        return -1;
    }
}
