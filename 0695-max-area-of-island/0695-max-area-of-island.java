class Solution{
    int count=0;
    public void visit(int [][]grid,int row,int col,boolean [][]visited){
        if(visited[row][col]) return;
        visited[row][col]=true;
        count++;
        int m=grid.length;
        int n=grid[0].length;
        if(row-1>=0 && grid[row-1][col]==1){
            visit(grid,row-1,col,visited);
        }
        if(row+1<m && grid[row+1][col]==1){
            visit(grid,row+1,col,visited);
        }
        if(col-1>=0 && grid[row][col-1]==1){
            visit(grid,row,col-1,visited);
        }
        if(col+1<n && grid[row][col+1]==1){
            visit(grid,row,col+1,visited);
        }
    }
    public int maxAreaOfIsland(int[][] grid){
        int ans=Integer.MIN_VALUE;
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(!visited[row][col] && grid[row][col]==1){
                    visit(grid,row,col,visited);
                    ans=Math.max(ans,count);
                    count=0;
                }
            }
        }
        return (ans==Integer.MIN_VALUE)?0:ans;
    }
}