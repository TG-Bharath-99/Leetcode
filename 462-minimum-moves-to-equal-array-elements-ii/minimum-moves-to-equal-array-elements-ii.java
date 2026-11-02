class Solution{
    public int minMoves2(int[] nums){
        Arrays.sort(nums);
        int mid=nums.length/2;
        int ans=0;
        for(int i=0;i<mid;i++){
            ans+=(nums[mid]-nums[i]);
        }
        for(int i=mid+1;i<nums.length;i++){
            ans+=(nums[i]-nums[mid]);
        }
        return ans;
    }
}