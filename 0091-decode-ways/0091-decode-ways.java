class Solution{
    int fun(int []dp,String s,int n){
        if(n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int one=0;
        int two=0;
        if(s.charAt(n-1)!='0'){
            one=fun(dp,s,n-1);
        }
        if(n>=2){
            int num=Integer.parseInt(s.substring(n-2,n));
            if(num>=10 && num<=26){
                two=fun(dp,s,n-2);
            }
        }
        dp[n]=one+two;
        return dp[n];
    }
    public int numDecodings(String s){
        int []dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
        return fun(dp,s,s.length());
    }
}