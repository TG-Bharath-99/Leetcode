class Solution{
    public int maxAbsoluteSum(int[] nums){
        int cs1=0,ms1=Integer.MIN_VALUE;
        int cs2=0,ms2=Integer.MAX_VALUE;
        for(int i : nums){
            cs1+=i;
            cs2+=i;
            ms1=Math.max(ms1,cs1);
            ms2=Math.min(ms2,cs2);
            if(cs1<0){
                cs1=0;
            }
            if(cs2>0){
                cs2=0;
            }
        }
        return Math.max(Math.abs(ms1),Math.abs(ms2));
    }
}