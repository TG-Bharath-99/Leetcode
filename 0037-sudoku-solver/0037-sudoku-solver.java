class Solution{
    public void solveSudoku(char[][] board){
        solve(board);
    }
    static boolean solve(char [][]board){
        int n=board.length;
        int r=-1;
        int c=-1;
        boolean empty=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    r=i;
                    c=j;
                    empty=false;
                    break;
                }
            }
            if(!empty){
                break;
            }
        }
        if(empty){
                return true;
            }
        for(char number='1';number<='9';number++){
            if(isSafe(board,r,c,number)){
                board[r][c]=number;
                if(solve(board)){
                    return true;
                }
                else{
                    board[r][c]='.';
                }
            }
        }
        return false;
    }
    static boolean isSafe(char [][]board,int r,int c,char target){
        for(int i=0;i<board.length;i++){
            if(board[r][i]==target){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][c]==target){
                return false;
            }
        }
        int sqrt=(int)Math.sqrt(board.length);
        int startRow=r-r%sqrt;
        int startCol=c-c%sqrt;
        for(int row=startRow;row<startRow+sqrt;row++){
            for(int col=startCol;col<startCol+sqrt;col++){
                if(board[row][col]==target){
                    return false;
                }
            }
        }
        return true;
    }
}