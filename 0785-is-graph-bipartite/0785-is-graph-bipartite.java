class Solution{
    boolean isB=false;
    public void visit(int [][]graph,int n,int key,boolean []visited,int []color){
        visited[key]=true;
        for(int nextkey : graph[key]){
            if(visited[nextkey] && color[nextkey]==color[key]){
                isB=true;
                return;
            }
            if(!visited[nextkey]){
                color[nextkey]=1-color[key];
                visit(graph,n,nextkey,visited,color);
                if(isB) return;
            }
        }
    }
    public boolean isBipartite(int[][] graph){
        int n=graph.length;
        boolean []visited=new boolean[n];
        int []color=new int[n];
         for(int j=0;j<n;j++) color[j]=-1;
        for(int i=0;i<n;i++){
            color[i]=0;
            if(!visited[i]) visit(graph,n,i,visited,color);
        }
        return !isB;
    }
}