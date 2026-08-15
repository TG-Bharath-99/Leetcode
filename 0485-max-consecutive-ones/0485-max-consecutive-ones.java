class Solution{
    public int findMaxConsecutiveOnes(int[] nums){
        int len=0;
        int ans=0;
        for(int i : nums){
            if(i==1) len++;
            else{
                ans=Math.max(ans,len);
                len=0;
            }
        }
        ans=Math.max(ans,len);
        return ans;
    }
}