class Solution{
    boolean [][]b;
    void set(int [][]matrix,int i,int j,int m,int n){
            for(int x=0;x<m;x++){
                if(!b[x][j] && matrix[x][j]!=0){
                    b[x][j]=true;
                    matrix[x][j]=0;
                }
            }
            for(int x=0;x<n;x++){
                if(!b[i][x] && matrix[i][x]!=0){
                    b[i][x]=true;
                    matrix[i][x]=0;
                }
            }
        }
    public void setZeroes(int[][] matrix){
        int m=matrix.length,n=matrix[0].length;
        b=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!b[i][j] && matrix[i][j]==0){
                    b[i][j]=true;
                    set(matrix,i,j,m,n);
                }
            }
        }
        
    }
}