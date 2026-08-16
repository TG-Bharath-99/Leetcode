class Solution{
    boolean ans=false;
    void convert(List<List<Integer>>graph,int n,int[][] prerequisites){
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
    }
    void visit(List<List<Integer>>graph,int key,int n,boolean []visited,boolean []pathvisited){
        if(ans) return;
        visited[key]=true;
        pathvisited[key]=true;
        for(int nei : graph.get(key)){
            if(visited[nei] && pathvisited[nei]){
                ans=true;
                return;
            }
            if(!visited[nei]){
                visit(graph,nei,n,visited,pathvisited);
            }
        }
        pathvisited[key]=false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>>graph=new ArrayList<>();
        convert(graph,numCourses,prerequisites);
        boolean []visited=new boolean[numCourses];
        boolean []pathvisited=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]) visit(graph,i,numCourses,visited,pathvisited);
        }
        return !ans;
    }
}