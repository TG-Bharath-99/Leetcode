class Solution{
    public void convert(int [][]edges,int n,List<List<double[]>>graph,double[] succProb){
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(new double[]{v,succProb[i]});
            graph.get(v).add(new double[]{u,succProb[i]});
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node){
        List<List<double[]>>graph=new ArrayList<>();
        convert(edges,n,graph,succProb);
        double []dis=new double[n];
        for(int i=0;i<n;i++) dis[i]=0.0;
        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)->Double.compare(b[1],a[1]));
        pq.offer(new double[]{start_node,1.0});
        dis[start_node]=1;
        while(!pq.isEmpty()){
            double []curr=pq.poll();
            int node=(int)curr[0];
            double cost=curr[1];
            if(cost<dis[node]) continue;
            if(node==end_node) return cost;
            for(double []nei : graph.get(node)){
                int neinode=(int)nei[0];
                double neicost=nei[1];
                double newcost=neicost*cost;
                if(newcost>dis[neinode]){
                    dis[neinode]=newcost;
                    pq.offer(new double[]{neinode,newcost});
                }
            }
        }
        return 0;
    }
}