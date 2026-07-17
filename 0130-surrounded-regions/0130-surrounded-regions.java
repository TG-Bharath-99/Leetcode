class Solution{
    void dfs(int row,int col,char [][]board,int m,int n){
        board[row][col]='#';
        if(row-1>=0 && row-1<m && col>=0 && col<n && board[row-1][col]=='O') dfs(row-1,col,board,m,n);
        if(row+1>=0 && row+1<m && col>=0 && col<n && board[row+1][col]=='O') dfs(row+1,col,board,m,n);
        if(row>=0 && row<m && col-1>=0 && col-1<n && board[row][col-1]=='O') dfs(row,col-1,board,m,n);
        if(row>=0 && row<m && col+1>=0 && col+1<n && board[row][col+1]=='O') dfs(row,col+1,board,m,n);
    }
    public void solve(char[][] board){
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<n;i++){
            if(board[0][i]=='O') dfs(0,i,board,m,n);
            if(board[m-1][i]=='O') dfs(m-1,i,board,m,n);
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O') dfs(i,0,board,m,n);
            if(board[i][n-1]=='O') dfs(i,n-1,board,m,n);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='#') board[i][j]='O';
            }
        }
    }
}