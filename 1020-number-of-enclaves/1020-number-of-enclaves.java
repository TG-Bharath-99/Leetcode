class Solution{
    void dfs(int row,int col,int [][]board,int m,int n){
        board[row][col]=0;
        if(row-1>=0 && row-1<m && col>=0 && col<n && board[row-1][col]==1) dfs(row-1,col,board,m,n);
        if(row+1>=0 && row+1<m && col>=0 && col<n && board[row+1][col]==1) dfs(row+1,col,board,m,n);
        if(row>=0 && row<m && col-1>=0 && col-1<n && board[row][col-1]==1) dfs(row,col-1,board,m,n);
        if(row>=0 && row<m && col+1>=0 && col+1<n && board[row][col+1]==1) dfs(row,col+1,board,m,n);
    }
    public int numEnclaves(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[0][i]==1) dfs(0,i,grid,m,n);
            if(grid[m-1][i]==1) dfs(m-1,i,grid,m,n);
        }
        for(int i=0;i<m;i++){
            if(grid[i][0]==1) dfs(i,0,grid,m,n);
            if(grid[i][n-1]==1) dfs(i,n-1,grid,m,n);
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) count++;
            }
        }
        return count;
    }
}