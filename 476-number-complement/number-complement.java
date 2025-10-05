class Solution {
    public int findComplement(int num){
        int bits=(int)(Math.log(num)/Math.log(2)+1);
        int res=(1<<bits)-1;
        return res^num;
    }
}