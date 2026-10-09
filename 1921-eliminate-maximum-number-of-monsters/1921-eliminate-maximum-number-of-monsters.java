class Solution{
    public int eliminateMaximum(int[] dist, int[] speed){
        int []time=new int[dist.length];
        for(int i=0;i<dist.length;i++){
            time[i]=(dist[i]+speed[i]-1)/speed[i];
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