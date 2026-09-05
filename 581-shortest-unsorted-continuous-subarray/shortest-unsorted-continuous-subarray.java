class Solution{
    public int findUnsortedSubarray(int[] nums){
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int left=0,right=n-1;
        while(left<n-1 && nums[left]<=nums[left+1]){
            left++;
        }
        if(left==n-1) return 0;
        while(right>0 && nums[right]>=nums[right-1]){
            right--;
        }
        if(right==0) return 0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=left;i<=right;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        while(left>0 && nums[left-1]>min){
            left--;
        }
        while(right<n-1 && nums[right+1]<max){
            right++;
        }
        ans=Math.min(ans,right-left+1);
        return ans;
    }
}