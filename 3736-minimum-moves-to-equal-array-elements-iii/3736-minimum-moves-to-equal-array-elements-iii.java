class Solution{
    public int minMoves(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i : nums) max=Math.max(max,i);
        int ans=0;
        for(int i : nums) ans+=Math.abs(max-i);
        return ans;
    }
}