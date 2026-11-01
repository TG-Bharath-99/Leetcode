class Solution{
    public int minMoves(int[] nums){
        int ans=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i : nums){
            min=Math.min(min,i);
            sum+=i;
        }
        return sum-(min*nums.length);
    }
}