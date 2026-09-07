class Solution{
    public int fib(int n){
        if(n<=1) return n;
        int one=0;
        int two=1;
        int ans=0;
        for(int i=2;i<n+1;i++){
            ans=one+two;
            one=two;
            two=ans;
        }
        return ans;
    }
}