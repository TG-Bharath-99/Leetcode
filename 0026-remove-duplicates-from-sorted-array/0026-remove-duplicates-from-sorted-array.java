class Solution{
    public int removeDuplicates(int[] nums){
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=nums[left]){
                left++;
                nums[left]=nums[right]+nums[left]-(nums[right]=nums[left]);
            }
        }
        return left+1;
    }
}