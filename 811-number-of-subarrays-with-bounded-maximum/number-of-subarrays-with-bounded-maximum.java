class Solution{
    public int numSubarrayBoundedMax(int[] nums, int l, int r){
        int left=0;
        int count=0;
        int linvalid=-1;
        int lvalid=-1;
        for(int right=0;right<nums.length;right++){
            if(nums[right]>r){
                linvalid=right;
            }
            if(nums[right]>=l && nums[right]<=r){
                lvalid=right;
            }
            count+=Math.max(0,lvalid-linvalid);
            }
        return count;
    }
}