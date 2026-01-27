class Solution{
    public int maxSubArray(int[] nums){
        if(nums.length==1){
            return nums[0];
        } 
        int cs=0,ms=Integer.MIN_VALUE;
        for(int x : nums){
             cs+=x;
               ms=Math.max(ms,cs);
           
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
}