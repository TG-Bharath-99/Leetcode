class Solution{
    public int longestSubarray(int[] nums){
        int ans=0;
        int left=0;
        int k=1;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) k--;
            while(k<0){
                if(nums[left]==0) k++;
                left++;
            }
            ans=Math.max(right-left+1,ans);
        }
        return ans-1;
    }
}