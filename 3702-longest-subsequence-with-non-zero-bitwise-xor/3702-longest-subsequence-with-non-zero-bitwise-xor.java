class Solution{
    public int longestSubsequence(int[] nums){
        int ans=0;
        boolean nonzero=false;
        for(int i : nums){
            ans^=i;
            if(i!=0) nonzero=true;
        }
        if(ans!=0) return nums.length;
        if(nonzero) return nums.length-1;
        return 0;
    }
}