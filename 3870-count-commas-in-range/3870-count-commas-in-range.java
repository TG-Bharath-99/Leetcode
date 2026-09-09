class Solution{
    public int countCommas(int n){
        int ans=0;
        int p=1000;
        while(p<=n){
            ans+=n-p+1;
            p*=1000;
        }
        return ans;
    }
}