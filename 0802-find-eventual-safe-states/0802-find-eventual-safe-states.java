class Solution{
    public List<Integer> eventualSafeNodes(int[][] list){
        int n=list.length;
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j : list[i]){
                graph.get(j).add(i);
            }
        }
        int []in=new int[n];
        for(int i=0;i<n;i++){
            in[i]=list[i].length;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0) q.offer(i);
        }
        List<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            ans.add(curr);
            for(int nei : graph.get(curr)){
                in[nei]--;
                if(in[nei]==0) q.offer(nei);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}