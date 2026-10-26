class Solution{
    int count=0;
    boolean b=true;
    void check(int [][]grid,int row,int col,int m,int n,boolean [][]visited){
        if(visited[row][col]) return;
        visited[row][col]=true;
        if(grid[row][col]==1) return;
        if(grid[row][col]==0 && (row==0 || row==m-1 || col==0 || col==n-1)){
            b=false;
        }
        if(row-1>=0 && grid[row-1][col]==0 && !visited[row-1][col]){
            check(grid,row-1,col,m,n,visited);
        }
        if(row+1<m && grid[row+1][col]==0 && !visited[row+1][col]){
            check(grid,row+1,col,m,n,visited);
        }
        if(col-1>=0 && grid[row][col-1]==0 && !visited[row][col-1]){
            check(grid,row,col-1,m,n,visited);
        }
        if(col+1<n && grid[row][col+1]==0 && !visited[row][col+1]){
            check(grid,row,col+1,m,n,visited);
        }
    }
    public int closedIsland(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>0 && j>0 && i<m-1 && j<n-1 && !visited[i][j] && grid[i][j]==0){
                    check(grid,i,j,m,n,visited);
                    if(b){
                        count++;
                    }
                    else{
                        b=true;
                    }
                }
            }
        }
        return count;
    }
}