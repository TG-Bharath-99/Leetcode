class Solution{
    int fun(int [][]dp,int m,int n){
        if(m<0 || n<0) return 0;
        if(m==0 && n==0) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        int right=0;
        int down=0;
        if(n>0){
            right=fun(dp,m,n-1);
        }
        if(m>0){
            down=fun(dp,m-1,n);
        }
        return dp[m][n]=right+down;
    }
    public int uniquePaths(int m, int n){
        int[][] dp = new int[m][n];
        return fun(dp,m-1,n-1);
    }
}