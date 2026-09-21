import java.util.*;
class Solution{
    int fun(int []dp,int n){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fun(dp,n-1)+fun(dp,n-2);
    }
    public int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        return fun(dp,n);
    }
}