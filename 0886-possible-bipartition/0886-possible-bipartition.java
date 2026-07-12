class Solution{
    public void convert(int [][]edges,int n,List<List<Integer>>graph){
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
    }
    public boolean possibleBipartition(int n, int[][] dislikes){
        List<List<Integer>>graph=new ArrayList<>();
        convert(dislikes,n+1,graph);
        boolean []visited=new boolean[n+1];
        int []color=new int[n+1];
        for(int i=0;i<=n;i++) color[i]=-1;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<=n;i++){
            if(!visited[i]){
                q.offer(i);
                color[i]=0;
                visited[i]=true;
                while(!q.isEmpty()){
                    int key=q.poll();
                    for(int nextkey : graph.get(key)){
                        if(visited[nextkey] && color[nextkey]==color[key]){
                            return false;
                        }
                        if(!visited[nextkey]){
                            visited[nextkey]=true;
                            color[nextkey]=1-color[key];
                            q.offer(nextkey);
                        }
                    }
                }
            }
        }
        return true;
    }
}