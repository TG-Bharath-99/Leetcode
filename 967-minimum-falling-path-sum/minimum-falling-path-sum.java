class Solution{
    int fun(int [][]dp,int [][]matrix,int m,int n){
        if(m==0 && (n>=0 && n<dp.length)){
            return dp[m][n]=matrix[m][n];
        }
        if(m<0 || n<0 || m>=dp.length || n>=dp.length) return (int)1e9;
        if(dp[m][n]!=Integer.MAX_VALUE) return dp[m][n];
        int left=0;
        int top=0;
        int right=0;
        left=matrix[m][n]+fun(dp,matrix,m-1,n-1);
        top=matrix[m][n]+fun(dp,matrix,m-1,n);
        right=matrix[m][n]+fun(dp,matrix,m-1,n+1);
        return dp[m][n]=Math.min(top,Math.min(left,right));
    }
    public int minFallingPathSum(int[][] matrix){
        int n=matrix.length;
        int [][]dp=new int[n][n];
        for(int []row : dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<matrix.length;j++){
            ans=Math.min(ans,fun(dp,matrix,n-1,j));
        }
        return ans;
    }
}