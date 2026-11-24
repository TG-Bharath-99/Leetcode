class Solution{
    int fun(int [][]grid,int [][]dp,int m,int n){
        if(m<0 || n<0) return 0;
        if(m==0 && n==0) return 1;
        if(grid[m][n]==1) return 0;
        if(dp[m][n]!=0) return dp[m][n];
        int right=0;
        int down=0;
        if(n>0){
            right=fun(grid,dp,m,n-1);
        }
        if(m>0){
            down=fun(grid,dp,m-1,n);
        }
        dp[m][n]=right+down;
        return dp[m][n];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
        if(m==1){
            for(int i=0;i<n;i++){
                if(obstacleGrid[0][i]==1) return 0;
            }
            return 1;
        }
        if(n==1){
            for(int i=0;i<m;i++){
                if(obstacleGrid[i][0]==1) return 0;
            }
            return 1;
        }
        int [][]dp=new int[m][n];
        return fun(obstacleGrid,dp,m-1,n-1);
    }
}