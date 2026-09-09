class Solution {
    public long countCommas(long n) {
        long ans=0;
        long p=1000;
        while(p<=n){
            ans+=n-p+1;
            p*=1000;
        }
        return ans;
    }
}