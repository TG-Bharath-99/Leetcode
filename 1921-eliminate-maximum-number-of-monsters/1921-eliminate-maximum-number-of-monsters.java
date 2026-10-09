class Solution{
    public int eliminateMaximum(int[] dist, int[] speed){
        double []time=new double[dist.length];
        for(int i=0;i<dist.length;i++){
            time[i]=Math.ceil((double)dist[i]/speed[i]);
        }
        Arrays.sort(time);
        int ans=0;
        for(int i=0;i<time.length;i++){
            if(time[i]<=i) return ans;
            ans++;
        }
        return ans;
    }
}