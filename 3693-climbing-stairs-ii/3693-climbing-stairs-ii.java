class Solution{
    int fun(int []dp,int []costs,int n){
        if(n==-1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int f1=99999;
        int f2=99999;
        int f3=99999;
        if(n>=0){
            f1=costs[n]+1+fun(dp,costs,n-1);
        }
        if(n>=1){
            f2=costs[n]+4+fun(dp,costs,n-2);
        }
        if(n>=2){
            f3=costs[n]+9+fun(dp,costs,n-3);
        }
        return dp[n]=Math.min(f1,Math.min(f2,f3));
    }
    public int climbStairs(int n, int[] costs){
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return fun(dp,costs,n-1);
    }
}