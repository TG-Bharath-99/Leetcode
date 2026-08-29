class Solution{
    public int shortestPathBinaryMatrix(int[][] grid){
        if(grid[0][0]==1) return -1;
        int m=grid.length;
        int n=grid[0].length;
        if(grid[m-1][n-1]==1) return -1;
        int [][]dis=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        int []r={0,0,-1,1,-1,-1,1,1};
        int []c={-1,1,0,0,-1,1,-1,1};
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.offer(new int[]{0,0,1});
        dis[0][0]=1;
        while(!pq.isEmpty()){
            int []curr=pq.poll();
            int row=curr[0];
            int col=curr[1];
            int cost=curr[2];
            if(row==m-1 && col==n-1) return cost;
            for(int i=0;i<8;i++){
                int newrow=row+r[i];
                int newcol=col+c[i];
                if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && grid[newrow][newcol]==0){
                    int newcost=cost+1;
                    if(newcost<dis[newrow][newcol]){
                        dis[newrow][newcol]=newcost;
                        pq.offer(new int[]{newrow,newcol,dis[newrow][newcol]});
                    }
                }
            }
        }
        return -1;
    }
}