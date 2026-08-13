class Solution{
    public boolean validPath(int n, int[][] edges, int source, int destination){
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer>q=new LinkedList<>();
        boolean []visited=new boolean[n];
        visited[source]=true;
        q.offer(source);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            for(int nei : graph.get(curr)){
                if(!visited[nei]){
                    q.offer(nei);
                    visited[nei]=true;
                }
            }
        }
        return false;
    }
}