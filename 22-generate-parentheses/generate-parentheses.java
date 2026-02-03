class Solution{
    public List<String> generateParenthesis(int n){
        List<String>ans=new ArrayList<>();
        fun(ans,"",n,n);
        return ans;
    }
    public void fun(List<String>ans,String s,int m,int n){
        if(m==0 && n==0){
            ans.add(s);
            return;
        }
        if(m>0){
            fun(ans,s+"(",m-1,n);
        }
        if(n>m){
            fun(ans,s+")",m,n-1);
        }
    }
}