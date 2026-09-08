class Solution{
    int fun(int []dp,int n){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fun(dp,n-1)+fun(dp,n-2);
    }
    public int climbStairs(int n){
        if(n<=1) return 1;
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++) dp[i]=-1;
        fun(dp,n);
        return dp[n];
    }
}