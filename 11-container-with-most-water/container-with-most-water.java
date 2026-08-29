class Solution{
    public int maxArea(int[] nums){
        int ans=0;
        int i=0,j=nums.length-1;
        while(i<j){
            int x=Math.min(nums[i],nums[j])*(j-i);
            ans=Math.max(ans,x);
            if(nums[i]<nums[j]) i++;
            else j--;
        }
        return ans;
    }
}