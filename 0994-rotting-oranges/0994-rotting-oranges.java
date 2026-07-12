class Solution{
    public int orangesRotting(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        boolean [][]visited=new boolean[m][n];
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
                else if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return fresh;
            int []dr={0,0,-1,1};
            int []dc={-1,1,0,0};
            int min=-1;
            while(!q.isEmpty()){
                int size=q.size();
                for(int j=0;j<size;j++){
                    int []curr=q.poll();
                    int row=curr[0];
                    int col=curr[1];
                    for(int i=0;i<4;i++){
                        int newrow=row+dr[i];
                        int newcol=col+dc[i];
                        if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && grid[newrow][newcol]==1 && !visited[newrow][newcol]){
                            visited[newrow][newcol]=true;
                            q.offer(new int[]{newrow,newcol});
                            grid[newrow][newcol]=2;
                        }
                    }
                }
                min++;
            }
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return min;
        }
        
}