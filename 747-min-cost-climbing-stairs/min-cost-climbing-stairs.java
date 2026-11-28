class Solution{
    int fun(int []cost,int []dp,int n){
        if(n<=1) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=cost[n-1]+fun(cost,dp,n-1);
        int right=cost[n-2]+fun(cost,dp,n-2);
        return dp[n]=Math.min(left,right);
    }
    public int minCostClimbingStairs(int[] cost){
        int n=cost.length;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(cost,dp,n);
    }
}