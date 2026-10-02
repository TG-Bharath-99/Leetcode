class Solution{
    void generate(List<String>ans,String s,int x,int y){
        if(x==0 && y==0){
            ans.add(s);
            return;
        }
        if(x>0){
            generate(ans,s+"(",x-1,y);
        }
        if(x<y){
            generate(ans,s+")",x,y-1);
        }
    }
    public List<String> generateParenthesis(int n){
        List<String>ans=new ArrayList<>();
        if(n==0){
            return ans;
        }
        generate(ans,"",n,n);
        return ans;
    }
}