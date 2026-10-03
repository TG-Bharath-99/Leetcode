class Solution{
    public int minOperations(int[] nums, int x){
        int total=0;
        for(int i : nums) total+=i;
        total-=x;
        int len=Integer.MIN_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>total){
                sum-=nums[left];
                left++;
                if(left>=right) break;
            }
            if(sum==total){
                len=Math.max(len,right-left+1);
            }
        }
        return (len==Integer.MIN_VALUE)?-1:nums.length-len;
    }
}