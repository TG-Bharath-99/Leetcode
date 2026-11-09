class Solution{
    public int[] countServers(int n, int[][] logs, int x, int[] queries){
        int []ans=new int[queries.length];
        Arrays.sort(logs,(a,b)->Integer.compare(a[1],b[1]));
        int [][]q=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            q[i][0]=queries[i];
            q[i][1]=i;
        }
        Arrays.sort(q,(a,b)->Integer.compare(a[0],b[0]));
        Map<Integer,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        for(int i=0;i<queries.length;i++){
            int l=q[i][0]-x;
            int r=q[i][0];
            while(right<logs.length && logs[right][1]<=r){
                map.put(logs[right][0],map.getOrDefault(logs[right][0],0)+1);
                right++;
            }
            while(left<right && logs[left][1]<l){
                map.put(logs[left][0],map.get(logs[left][0])-1);
                if(map.get(logs[left][0])==0){
                    map.remove(logs[left][0]);
                }
                left++;
            }
            ans[q[i][1]]=n-map.size();
        }
        return ans;
    }
}