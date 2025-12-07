class Solution{
    static boolean isValid(char [][]board,int r,int c,char target){
        for(int i=0;i<9;i++){
            if(i!=c){
                if(board[r][i]==target){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++){
            if(i!=r){
                if(board[i][c]==target){
                    return false;
                }
            }
        }
        int n=board.length;
        int sqrt=(int)Math.sqrt(n);
        int startRow=r-r%sqrt;
        int startCol=c-c%sqrt;
        for(int i=startRow;i<startRow+sqrt;i++){
            for(int j=startCol;j<startCol+sqrt;j++){
                if(i==r && j==c){
                   continue; 
                    }
                if(board[i][j]==target){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!isValid(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}