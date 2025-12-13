class Solution{
    public int longestSubarray(int[] nums){
        int left=0,right=0;
        int zerocount=0;
        int ans=0;
        while(right<nums.length){
            if(nums[right]==0) zerocount++;
            while(zerocount>1){
                if(nums[left]==0) zerocount--;
                left++;
            }
            ans=Math.max(ans,right-left);
            right++;
        }
        return ans;
    }
}