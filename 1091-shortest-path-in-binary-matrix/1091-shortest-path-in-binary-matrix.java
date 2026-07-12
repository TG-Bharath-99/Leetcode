class Solution{
    public int shortestPathBinaryMatrix(int[][] grid){
        int dis=1;
        if(grid[0][0]==1) return -1;
        int m=grid.length;
        int n=grid[0].length;
        if(grid[m-1][n-1]==1) return -1;
        boolean [][]visited=new boolean[m][n];
        int []dr={0,0,-1,1,-1,-1,1,1};
        int []dc={-1,1,0,0,-1,1,-1,1};
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{0,0});
        visited[0][0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            for(int j=0;j<size;j++){
                int []curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            if(row==m-1 && col==n-1) return dis;
                for(int i=0;i<8;i++){
                int newrow=row+dr[i];
                int newcol=col+dc[i];
                if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && !visited[newrow][newcol] && grid[newrow][newcol]==0){
                    q.offer(new int[]{newrow,newcol});
                    visited[newrow][newcol]=true;
                   }
                }
            }
            dis++;
        }
        return -1;
    }
}