class Solution{
    public int numSubarrayProductLessThanK(int[] nums, int k){
        if(k==0 || k==1){
            return 0;
        }
        long p=1;
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            p*=nums[right];
            while(p>=k){
                p/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}