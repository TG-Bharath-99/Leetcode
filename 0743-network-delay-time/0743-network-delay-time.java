class Solution{
    public void convert(int [][]times,int n,List<List<int[]>>graph){
        for(int i=0;i<=n;i++) graph.add(new ArrayList<>());
        for(int []edge : times){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            graph.get(u).add(new int[]{v,w});
        }
    }
    public int networkDelayTime(int[][] times, int n, int k){
        int []dis=new int[n+1];
        int count=-1;
        List<List<int[]>>graph=new ArrayList<>();
        convert(times,n,graph);
        for(int i=1;i<=n;i++) dis[i]=Integer.MAX_VALUE;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        dis[k]=0;
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
                int []curr=pq.poll();
                int node=curr[0];
                int currdis=curr[1];
                if(currdis>dis[node]) continue;
                for(int []nei : graph.get(node)){
                    int neinode=nei[0];
                    int neidis=nei[1];
                    if(neidis+dis[node]<dis[neinode]){
                        dis[neinode]=neidis+dis[node];
                    
                    pq.offer(new int[]{neinode,dis[neinode]});}
                }
           
        }
        int max=-999;
        for(int i=1;i<dis.length;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,dis[i]);
        }
        return max;
    }
}