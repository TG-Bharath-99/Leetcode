class Solution{
    public int climbStairs(int n, int[] cost){
        int f=0;
        int s=cost[0]+1;
        if(n==1) return s;
        int t=cost[1]+Math.min(4,s+1);
        for(int i=3;i<=n;i++){
            int x=cost[i-1]+Math.min(f+9,Math.min(s+4,t+1));
            f=s;
            s=t;
            t=x;
        }
        return t;
    }
}