class Solution{
    int fun(int []cost,int []dp,int n){
        if(n<0) return 999;
        if(n<=1){
            return dp[n]=cost[n];
        }
        if(dp[n]!=-1) return dp[n];
        int left=cost[n]+fun(cost,dp,n-1);
        int right=cost[n]+fun(cost,dp,n-2);
        return dp[n]=Math.min(left,right);
    }
    public int minCostClimbingStairs(int[] cost){
        int n=cost.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(fun(cost,dp,n-1),fun(cost,dp,n-2));
    }
}