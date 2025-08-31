class Solution {
    public int maxProduct(int[] nums){
        int max=nums[0],min=nums[0],result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                min=min+max-(max=min);
            }
            max=Math.max(nums[i],nums[i]*max);
            min=Math.min(nums[i],nums[i]*min);
            result=Math.max(result,max);
        }
        return result;
    }
}