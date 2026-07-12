class Solution{
    public int[][] updateMatrix(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int [][]ans=new int[m][n];
        Queue<int[]>q=new LinkedList<>();
        boolean [][]visited=new boolean[m][n];
        int []dr={0,0,-1,1};
        int []dc={-1,1,0,0};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
                else{
                    ans[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int []curr=q.poll();
                int row=curr[0];
                int col=curr[1];
                for(int j=0;j<4;j++){
                    int newrow=row+dr[j];
                    int newcol=col+dc[j];
                    if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && !visited[newrow][newcol]){
                        ans[newrow][newcol]=ans[row][col]+1;
                        q.offer(new int[]{newrow,newcol});
                        visited[newrow][newcol]=true;
                    }
                }
        }
        return ans;
    }
}