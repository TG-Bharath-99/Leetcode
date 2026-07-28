class Solution{
    void convert(List<List<int[]>>graph,int n,int [][]roads){
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<roads.length;i++){
            graph.get(roads[i][0]).add(new int[]{roads[i][1],roads[i][2]});
            graph.get(roads[i][1]).add(new int[]{roads[i][0],roads[i][2]});
        }
    }
    public int countPaths(int n,int[][] roads){
        List<List<int[]>>graph=new ArrayList<>();
        convert(graph,n,roads);
        PriorityQueue<long[]>pq=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        pq.offer(new long[]{0,0});
        int mod=1_000_000_007;
        long[]dis=new long[n];
        int[]ways=new int[n];
        for(int i=0;i<n;i++){
            dis[i]=Long.MAX_VALUE;
            ways[i]=0;
        }
        dis[0]=0;
        ways[0]=1;
        while(!pq.isEmpty()){
            long[]curr=pq.poll();
            int node=(int)curr[0];
            long cost=curr[1];
            if(cost>dis[node]) continue;
            for(int[]nei:graph.get(node)){
                int newnode=nei[0];
                int newcost=nei[1];
                if(cost+newcost<dis[newnode]){
                    dis[newnode]=cost+newcost;
                    pq.offer(new long[]{newnode,dis[newnode]});
                    ways[newnode]=ways[node];
                }
                else if(cost+newcost==dis[newnode]){
                    ways[newnode]=(ways[newnode]+ways[node])%mod;
                }
            }
        }
        return ways[n-1];
    }
}