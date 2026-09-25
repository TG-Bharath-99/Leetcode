class Solution{
    public int islandPerimeter(int[][] grid){
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(j-1<0 || grid[i][j-1]==0) ans++;
                    if(j+1>=n || grid[i][j+1]==0) ans++;
                    if(i-1<0 || grid[i-1][j]==0) ans++;
                    if(i+1>=m || grid[i+1][j]==0) ans++;
                }
            }
        }
        return ans;
    }
}