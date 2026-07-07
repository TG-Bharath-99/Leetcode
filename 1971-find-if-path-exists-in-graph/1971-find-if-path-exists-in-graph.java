class Solution{
    public void convertToList(int [][]edges,int n,List<List<Integer>>graph){
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination){
        List<List<Integer>>graph=new ArrayList<>();
        convertToList(edges,n,graph);
        Queue<Integer>q=new LinkedList<>();
        boolean []visited=new boolean[n];
        q.offer(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            for(int num : graph.get(curr)){
                if(!visited[num]){
                    q.offer(num);
                    visited[num]=true;
                }
            }
        }
        return false;
    }
}