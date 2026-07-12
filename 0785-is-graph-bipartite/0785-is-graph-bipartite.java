class Solution{
    public boolean isBipartite(int[][] graph){
        int n=graph.length;
        boolean []visited=new boolean[n];
        int []color=new int[n];
        Queue<Integer>q=new LinkedList<>();
        for(int j=0;j<n;j++) color[j]=-1;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                q.offer(i);
            color[i]=0;
                visited[i]=true;
                while(!q.isEmpty()){
                    int key=q.poll();
                    for(int nextkey : graph[key]){
                        if(visited[nextkey] && color[nextkey]==color[key]){
                            return false;
                        }
                        else if(!visited[nextkey]){
                            q.offer(nextkey);
                            visited[nextkey]=true;
                            color[nextkey]=1-color[key];
                        }
                    }
                }
            }
        }
        return true;
    }
}