class Solution{
    int fun(int [][]dp,int [][]grid,int m,int n){
        if(m==0 && n==0){
            return dp[m][n]=grid[m][n];
        }
        if(n<0 || m<0){
            return Integer.MAX_VALUE;
        }
        if(dp[m][n]!=Integer.MAX_VALUE) return dp[m][n];
        int down=0;
        int right=0;
        if(n>=0){
            right=fun(dp,grid,m,n-1);
        }
        if(m>=0){
            down=fun(dp,grid,m-1,n);
        }
        return dp[m][n]=grid[m][n]+Math.min(down,right);
    }
    public int minPathSum(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp=new int[m][n];
        for(int []row : dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        return fun(dp,grid,m-1,n-1);
    }
}