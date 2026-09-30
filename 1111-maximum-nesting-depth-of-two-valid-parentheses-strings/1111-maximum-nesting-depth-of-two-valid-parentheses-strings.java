class Solution{
    public int[] maxDepthAfterSplit(String seq){
        int x=0;
        int []ans=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                ans[i]=(x%2);
                x++;
            }
            else{
                x--;
                ans[i]=(x%2);
            }
        }
        return ans;
    }
}