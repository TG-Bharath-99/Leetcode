class Solution{
    int cnt=Integer.MIN_VALUE;
    int [][]heal;
    void visit(List<List<Integer>> grid,boolean [][]visited,int row,int col,int m,int n,int health){
        if(grid.get(row).get(col)==1) health--;
        if(health<=0) return;
        if(health<=heal[row][col]) return;
        heal[row][col]=health;
        if(row==m-1 && col==n-1){
            cnt=Math.max(cnt,health);
            return;
        }
        if(visited[row][col]) return;
        visited[row][col]=true;
        
        if(row-1>=0 && !visited[row-1][col]){
            visit(grid,visited,row-1,col,m,n,health);
        }
        if(row+1<m && !visited[row+1][col]){
            visit(grid,visited,row+1,col,m,n,health);
        }
        if(col-1>=0 && !visited[row][col-1]){
            visit(grid,visited,row,col-1,m,n,health);
        }
        if(col+1<n && !visited[row][col+1]){
            visit(grid,visited,row,col+1,m,n,health);
        }
        visited[row][col]=false;
    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health){
        int m=grid.size();
        int n=grid.get(0).size();
        heal=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                heal[i][j]=Integer.MIN_VALUE;
            }
        }
        boolean [][]visited=new boolean[m][n];
        visit(grid,visited,0,0,m,n,health);
        return cnt>0;
    }
}