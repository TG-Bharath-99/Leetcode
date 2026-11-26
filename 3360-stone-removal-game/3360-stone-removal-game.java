class Solution {
    public boolean canAliceWin(int n) {
        boolean alice=false;
        int i=10;
        while(n>=i){
            n=n-i;
            alice=!alice;
            i--;
        }
        return alice;
    }
}