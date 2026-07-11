class Solution{
    boolean hasCycle=false;
    public void convert(int [][]prerequisites,int n,List<List<Integer>>graph){
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++) graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
    }
    public void visit(int[][] edges,int key,int n,boolean []visited,boolean []pathVisited,List<List<Integer>>graph){
        if(hasCycle) return;
        visited[key]=true;
        pathVisited[key]=true;
        for(int nextkey : graph.get(key)){
            if(visited[nextkey] && pathVisited[nextkey]){
                hasCycle=true;
                return;
            }
            if(!visited[nextkey]){
                visit(edges,nextkey,n,visited,pathVisited,graph);
            }
        }
        pathVisited[key]=false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites){
        boolean []visited=new boolean[numCourses];
        boolean []pathVisited=new boolean[numCourses];
        List<List<Integer>>graph=new ArrayList<>();
        convert(prerequisites,numCourses,graph);
        for(int i=0;i<numCourses;i++){
            if(!visited[i]) visit(prerequisites,i,numCourses,visited,pathVisited,graph);
        }
        return !hasCycle;
    }
}