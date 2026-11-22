class Solution{
    int fun(int []dp,int n){
        if(n<=1){
            return dp[n];
        }
        if(dp[n]!=-1) return dp[n];
        int left=fun(dp,n-1);
        int right=fun(dp,n-2);
        dp[n]=left+right;
        return dp[n];
    }
    public int climbStairs(int n){
        if(n<=1) return n;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[1]=1;
        dp[2]=2;
        return fun(dp,n);
    }
}