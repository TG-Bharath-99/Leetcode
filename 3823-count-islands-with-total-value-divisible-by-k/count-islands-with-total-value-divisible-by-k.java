class Solution{
    long sum=0;
    void fun(int [][]grid,int m,int n,int row,int col,boolean [][]visited){
        if(visited[row][col]) return;
        visited[row][col]=true;
        sum+=grid[row][col];
        if(row-1>=0 && grid[row-1][col]>0 && !visited[row-1][col]){
            fun(grid,m,n,row-1,col,visited);
        }
        if(row+1<m && grid[row+1][col]>0 && !visited[row+1][col]){
            fun(grid,m,n,row+1,col,visited);
        }
        if(col-1>=0 && grid[row][col-1]>0 && !visited[row][col-1]){
            fun(grid,m,n,row,col-1,visited);
        }
        if(col+1<n && grid[row][col+1]>0 && !visited[row][col+1]){
            fun(grid,m,n,row,col+1,visited);
        }
    }
    public int countIslands(int[][] grid, int k){
        int m=grid.length;
        int n=grid[0].length;
        long ans=0;
        boolean [][]visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0 && !visited[i][j]){
                    fun(grid,m,n,i,j,visited);
                    if(sum%k==0){
                        ans++;
                    }
                    sum=0;
                }
            }
        }
        return (int)ans;
    }
}