class Solution{
    public void convertToList(List<List<Integer>>graph,int n,int [][]edges){
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination){
        if(source==destination) return true;
        List<List<Integer>>graph=new ArrayList<>();
        convertToList(graph,n,edges);
        boolean []visited=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        visited[source]=true;
        q.offer(source);
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int num : graph.get(curr)){
                if(num==destination){
                    return true;
                }
                if(!visited[num]){
                    visited[num]=true;
                    q.offer(num);
                }
            }
        }
        return false;
    }
}