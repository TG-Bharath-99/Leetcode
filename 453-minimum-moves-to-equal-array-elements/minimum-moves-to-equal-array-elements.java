class Solution{
    public int minMoves(int[] nums){
        Arrays.sort(nums);
        int ans=0;
        int last=nums[nums.length-1];
        int i=0;
        int j=nums.length-1;
        while(j>=0){
            ans+=(nums[j]-nums[i]);
            j--;
        }
        return ans;
    }
}