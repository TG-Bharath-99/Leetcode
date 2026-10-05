class Solution{
    public int maxProfit(int[] prices){
        int ans=Integer.MAX_VALUE;
        int p=0;
        for(int i : prices){
            if(i<ans) ans=i;
            else p=Math.max(p,i-ans);
        }
        return p;
    }
}