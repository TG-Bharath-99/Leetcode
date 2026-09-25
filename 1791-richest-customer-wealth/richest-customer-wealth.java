class Solution{
    public int maximumWealth(int[][] accounts){
        int ans=0;
        int c=0;
        for(int []i : accounts){
            for(int j : i){
                c+=j;
            }
            ans=Math.max(ans,c);
            c=0;
        }
        return ans;
    }
}