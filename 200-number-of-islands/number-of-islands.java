class Solution{
    int count=0;
    public void visit(char [][]grid,int row,int col,boolean [][]visited){
        if(visited[row][col]) return;
        visited[row][col]=true;
        if(row-1>=0 && col<grid[0].length && grid[row-1][col]=='1'){
            visit(grid,row-1,col,visited);
        }
        if(row+1<grid.length && col<grid[0].length && grid[row+1][col]=='1'){
            visit(grid,row+1,col,visited);
        }
        if(row<grid.length && col-1>=0 && grid[row][col-1]=='1'){
            visit(grid,row,col-1,visited);
        }
        if(row<grid.length && col+1<grid[0].length && grid[row][col+1]=='1'){
            visit(grid,row,col+1,visited);
        }
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