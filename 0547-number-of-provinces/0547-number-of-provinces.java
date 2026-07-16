class Solution{
    public void convert(int [][]isConnected,List<List<Integer>>graph){
        for(int i=0;i<=isConnected.length;i++)  graph.add(new ArrayList<>());
        for(int i=1;i<=isConnected.length;i++){
            for(int j=i+1;j<=isConnected.length;j++){
                if(isConnected[i-1][j-1]==1){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected){
        List<List<Integer>>graph=new ArrayList<>();
        convert(isConnected,graph);
        int count=0;
        int n=isConnected.length;
        boolean []visited=new boolean[n+1];
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                q.offer(i);
            visited[i]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int nei : graph.get(curr)){
                if(!visited[nei]){
                    q.offer(nei);
                visited[nei]=true;
                }
            }
        }count++;
            }
        }
        return count;
    }
}