class Solution{
    public int swimInWater(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int [][]dis=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) dis[i][j]=Integer.MAX_VALUE;
        }
        dis[0][0]=grid[0][0];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.offer(new int[]{0,0,grid[0][0]});
        int []dr={0,0,-1,1};
        int []dc={-1,1,0,0};
        while(!pq.isEmpty()){
            int []curr=pq.poll();
            int row=curr[0];
            int col=curr[1];
            int time=curr[2];
            if(row==m-1 && col==n-1) return time;
            if(dis[row][col]<time) continue;
            for(int i=0;i<4;i++){
                int newrow=row+dr[i];
                int newcol=col+dc[i];
                if(newrow<0 || newrow>=m || newcol<0 || newcol>=n) continue;
                int newtime=Math.max(time,grid[newrow][newcol]);
                if(newtime<dis[newrow][newcol]){
                    dis[newrow][newcol]=newtime;
                    pq.offer(new int[]{newrow,newcol,newtime});
                }
            }
        }
        return 0;
    }
}