class Solution{
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k){
        List<List<int[]>>graph=new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<flights.length;i++){
            int source=flights[i][0];
            int dest=flights[i][1];
            int cost=flights[i][2];
            graph.get(source).add(new int[]{dest,cost});
        }
        int []dis=new int[n];
        for(int i=0;i<n;i++) dis[i]=Integer.MAX_VALUE;
        dis[src]=0;
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{src,0,0});
        while(!q.isEmpty()){
            int []curr=q.poll();
            int sour=curr[0];
            int cost=curr[1];
            int stops=curr[2];
            if(stops>k) continue;
            for(int []nei : graph.get(sour)){
                int neinode=nei[0];
                int neicost=nei[1];
                if(cost+neicost<dis[neinode]){
                    dis[neinode]=cost+neicost;
                    q.offer(new int[]{neinode,dis[neinode],stops+1});
                }
            }
        }
        if(dis[dst]==Integer.MAX_VALUE) return -1;
        return dis[dst];
    }
}