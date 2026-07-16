class Solution{
    public int minimumEffortPath(int[][] heights){
        int m=heights.length;
        int n=heights[0].length;
        int [][]dis=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        dis[0][0]=0;
        int []dr={0,0,-1,1};
        int []dc={-1,1,0,0};
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.offer(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int []curr=pq.poll();
            int row=curr[0];
            int col=curr[1];
            int eff=curr[2];
            if(row==m-1 && col==n-1) return eff;
            if(eff>dis[row][col]) continue;
            for(int i=0;i<4;i++){
                int newrow=row+dr[i];
                int newcol=col+dc[i];
                if(newrow<0 || newrow>=m || newcol<0 || newcol>=n) continue;
                int weight=Math.abs(heights[newrow][newcol]-heights[row][col]);
                int neweff=Math.max(eff,weight);
                if (neweff<dis[newrow][newcol]) {
                    dis[newrow][newcol]=neweff;
                    pq.offer(new int[]{newrow,newcol,neweff});
                }
            }
        }
        return 0;
    }
}