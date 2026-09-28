class Solution{
    public int maxDepth(String s){
        int ans=0;
        int c=0;
        for(char ch : s.toCharArray()){
            if(ch=='(') c++;
            if(ch==')') c--;
            ans=Math.max(ans,c);
        }
        return ans;
    }
}