class Solution{
    int fun(int []nums,int n,int tar){
        if(n<0){
            return tar==0?1:0;
        }
        int left=fun(nums,n-1,tar+nums[n]);
        int right=fun(nums,n-1,tar-nums[n]);
        return left+right;
    }
    public int findTargetSumWays(int[] nums, int target){
        return fun(nums,nums.length-1,target);
    }
}