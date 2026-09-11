class Solution{
    int fun(int []dp,int n,int []cost){
        if(dp[n]!=-1) return dp[n];
        if(n==0) return 0;
        if(n==1) return cost[n-1]+fun(dp,n-1,cost)+1;
        if(n==2){
            return dp[n]=cost[n-1]+Math.min(fun(dp,n-1,cost)+1,fun(dp,n-2,cost)+4);
        }
        if(n==3){
            return dp[n]=cost[n-1]+Math.min(Math.min(fun(dp,n-1,cost)+1,fun(dp,n-2,cost)+4),fun(dp,n-3,cost)+9);
        }
        
        dp[n]=cost[n-1]+Math.min(Math.min(fun(dp,n-1,cost)+1,fun(dp,n-2,cost)+4),fun(dp,n-3,cost)+9);
        return dp[n];
    }
    public int climbStairs(int n, int[] cost){
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        if(n==0) return 0;
        if(n==1) return cost[n-1]+fun(dp,n-1,cost)+1;
        if(n==2){
            return dp[n]=cost[n-1]+Math.min(fun(dp,n-1,cost)+1,fun(dp,n-2,cost)+4);
        }
        if(n==3){
            return dp[n]=cost[n-1]+Math.min(Math.min(fun(dp,n-1,cost)+1,fun(dp,n-2,cost)+4),fun(dp,n-3,cost)+9);
        }
        fun(dp,n,cost);
        return dp[n];
    }
}