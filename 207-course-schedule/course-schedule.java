class Solution{
    public void convert(int [][]edges,int V,List<List<Integer>>graph,int []in){
        for(int i=0;i<V;i++) graph.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            graph.get(u).add(v);
            in[v]++;
        }
    }
    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>>graph=new ArrayList<>();
        int []in=new int[numCourses];
        convert(prerequisites,numCourses,graph,in);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(in[i]==0) q.offer(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int key=q.poll();
            count++;
            for(int nei : graph.get(key)){
                in[nei]--;
                if(in[nei]==0) q.offer(nei);
            }
        }
        return count==numCourses;
    }
}