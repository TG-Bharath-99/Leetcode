class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0,ones=0;
        for(int i : nums){
            if(i==1){
                ones++;
            }
            else{
                ans=Math.max(ans,ones);
                ones=0;
            }
        }
        ans=Math.max(ans,ones);
        return ans;
    }
}