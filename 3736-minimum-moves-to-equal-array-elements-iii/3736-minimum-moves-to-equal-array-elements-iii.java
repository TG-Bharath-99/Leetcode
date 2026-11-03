class Solution{
    public int minMoves(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i : nums){
            max=Math.max(max,i);
            sum+=i;
        }
        return (max*nums.length)-sum;
    }
}