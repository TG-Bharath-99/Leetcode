class Solution{
    public boolean canAliceWin(int n){
        boolean ans=false;
        int x=10;
        while(n>=x){
            n-=x;
            x--;
            ans=!ans;
        }
        return ans;
    }
}