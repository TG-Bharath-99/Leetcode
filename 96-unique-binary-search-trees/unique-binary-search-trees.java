class Solution{
    public int numTrees(int n){
        int []dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int root=1;root<=i;root++){
                int left=root-1;
                int right=i-root;
                dp[i]+=dp[left]*dp[right];
            }
        }
        return dp[n];
    }
}