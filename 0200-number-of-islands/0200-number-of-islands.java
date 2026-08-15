class Solution{
    int count=0;
    void visit(char [][]grid,int row,int col,boolean [][]visited){
        if(visited[row][col]) return;
        visited[row][col]=true;
        int m=grid.length;
        int n=grid[0].length;
        if(row-1>=0 && grid[row-1][col]=='1') visit(grid,row-1,col,visited);
        if(row+1<m && grid[row+1][col]=='1') visit(grid,row+1,col,visited);
        if(col-1>=0 && grid[row][col-1]=='1') visit(grid,row,col-1,visited);
        if(col+1<n && grid[row][col+1]=='1') visit(grid,row,col+1,visited);
    }
    public int numIslands(char[][] grid){
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    visit(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
}