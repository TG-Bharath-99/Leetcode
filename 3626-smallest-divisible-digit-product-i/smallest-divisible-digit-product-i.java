class Solution{
    int sum(int n){
        int s=1;
        while(n>0){
            s*=n%10;
            n/=10;
        }
        return s;
    }
    public int smallestNumber(int n, int t){
        while(1<2){
            if(sum(n)%t==0) return n;
            n++;
        }
    }
}