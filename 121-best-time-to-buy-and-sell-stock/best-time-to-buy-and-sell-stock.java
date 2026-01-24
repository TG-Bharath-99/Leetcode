class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i :prices){
            if(i<min){
                min=i;
            }
            else{
                profit=Math.max(profit,i-min);
            }
        }
        return profit;
    }
}