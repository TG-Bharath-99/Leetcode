class Solution{
    public String[] createGrid(int m, int n){
        String []ans=new String[m];
        int idx=0;
        for(int i=0;i<m;i++){
            String s="";
            for(int j=0;j<n;j++){
                if(i==0) s+=".";
                else if(i>0 && j==n-1){
                    s+=".";
                }
                else{
                    s+="#";
                }
            }
            ans[idx++]=s;
        }
        return ans;
    }
}