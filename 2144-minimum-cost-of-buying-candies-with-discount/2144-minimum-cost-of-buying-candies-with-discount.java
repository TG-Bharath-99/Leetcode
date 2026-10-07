class Solution{
    public int minimumCost(int[] cost){
        if(cost.length==1) return cost[0];
        if(cost.length==2) return cost[0]+cost[1];
        int ans=0;
        int c1=-1;
        int c2=-1;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            if(c1==-1) c1=cost[i];
            else if(c2==-1) c2=cost[i];
            else{
                ans+=c1+c2;
                c1=-1;
                c2=-1;
            }
        }
        if(c1!=-1) ans+=c1;
        if(c2!=-1) ans+=c2;
        return ans;
    }
}