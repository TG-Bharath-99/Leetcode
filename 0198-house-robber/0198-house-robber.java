class Solution{
    int fun(int []dp,int []nums,int n){
        if(n<=2){
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int left=nums[n]+fun(dp,nums,n-2);
        int right=nums[n]+fun(dp,nums,n-3);
        dp[n]=Math.max(left,right);
        return dp[n];
    }
    public int rob(int[] nums){
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        if(n==3) return Math.max(nums[0]+nums[2],nums[1]);
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[0]+nums[2];
        fun(dp,nums,n-1);
        int res1=Math.max(dp[n-1],dp[n-2]);
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[0]+nums[2];
        fun(dp,nums,n-2);
        int res2=Math.max(dp[n-1],dp[n-2]);
        return Math.max(res1,res2);
    }
}