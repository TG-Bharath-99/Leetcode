class Solution{
    public long maximumImportance(int n, int[][] roads){
        long ans=0;
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<roads.length;i++){
            int x=roads[i][0];
            int y=roads[i][1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        int []in=new int[n];
        for(int i=0;i<roads.length;i++){
            in[roads[i][0]]++;
            in[roads[i][1]]++;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->Integer.compare(in[b],in[a]));
        for(int i=0;i<in.length;i++){
            pq.offer(i);
        }
        int []imp=new int[n];
        int x=n;
        while(!pq.isEmpty()){
            int city=pq.poll();
            imp[city]=x--;
        }
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++){
            visited[i]=true;
            for(int nei : graph.get(i)){
                if(!visited[nei]){
                    ans+=imp[i]+imp[nei];
                }
            }
        }
        return ans;
    }
}