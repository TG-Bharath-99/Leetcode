class Solution{
    public int maxSubarraySumCircular(int[] nums){
        int maxs=Integer.MIN_VALUE,mins=Integer.MAX_VALUE;
        int csmax=0,csmin=0;
        int total=0;
        int ans=Integer.MIN_VALUE;
        for(int i : nums){
            csmax+=i;
            maxs=Math.max(maxs,csmax);
            if(csmax<0){
                csmax=0;
            }
            csmin+=i;
            mins=Math.min(mins,csmin);
            if(csmin>0){
                csmin=0;
            }
            total+=i;
        }
        if(total==mins){
            return maxs;
        }
        return Math.max(maxs,total-mins);
    }
}