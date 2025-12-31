class Solution{
    public int diagonalSum(int[][] mat){
        int sum=0;
        int col=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            mat[i][i]=0;
            sum+=mat[i][col-i];
            mat[i][col-i]=0;
        }
        return sum;
    }
}