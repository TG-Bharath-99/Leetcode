class Solution{
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int ans=0;
        int left=0;
        int p=1;
        for(int right=0;right<nums.length;right++){
            p*=nums[right];
            while(p>=k && left<right){
                p/=nums[left];
                left++;
            }
            if(p<k){
                ans+=right-left+1;
            }
        }
        return ans;
    }
}