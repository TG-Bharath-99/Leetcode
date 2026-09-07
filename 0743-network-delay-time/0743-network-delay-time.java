class Solution{
    void convert(int [][]times,int n,List<List<int[]>>graph){
        for(int i=0;i<=n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            graph.get(u).add(new int[]{v,w});
        }
    }
    public int networkDelayTime(int[][] times, int n, int k){
        List<List<int[]>>graph=new ArrayList<>();
        convert(times,n,graph);
        int []dis=new int[n+1];
        for(int i=0;i<n+1;i++) dis[i]=Integer.MAX_VALUE;
        dis[k]=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int []curr=pq.poll();
            int node=curr[0];
            int cost=curr[1];
            if(cost>dis[node]) continue;
            for(int []nei : graph.get(node)){
                int newnode=nei[0];
                int newcost=nei[1];
                if(newcost+dis[node]<dis[newnode]){
                    dis[newnode]=dis[node]+newcost;
                    pq.offer(new int[]{newnode,dis[newnode]});
                }
            }
        }
        int ans=-1;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dis[i]);
        }
        return ans;
    }
}