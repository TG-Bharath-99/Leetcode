class Solution{
    public long maximumImportance(int n, int[][] roads){
        long ans=0;
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
        for(int i=0;i<roads.length;i++){
            ans+=imp[roads[i][0]]+imp[roads[i][1]];
        }
        return ans;
    }
}