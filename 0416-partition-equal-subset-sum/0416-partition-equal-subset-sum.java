class Solution{
    boolean fun(int [][]dp,int []nums,int n,int take,int skip){
        if(n<0){
            return take==skip;
        }
        if(dp[n][take]!=-1){
            return dp[n][take]==1;
        }
        boolean left=fun(dp,nums,n-1,take+nums[n],skip);
        boolean right=fun(dp,nums,n-1,take,skip+nums[n]);
        boolean ans=left||right;
        dp[n][take]=ans?1:0;
        return ans;
    }
    public boolean canPartition(int[] nums){
        int sum=0;
        for(int num : nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        int [][]dp=new int[nums.length][sum+1];
        for(int []row : dp){
            Arrays.fill(row,-1);
        }
        return fun(dp,nums,nums.length-1,0,0);
    }
}