class Solution{
    public double findMaxAverage(int[] nums, int k){
        double ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        ans=Math.max(ans,(double)sum/k);
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            ans=Math.max(ans,(double)sum/k);
        }
        return (double)ans;
    }
}