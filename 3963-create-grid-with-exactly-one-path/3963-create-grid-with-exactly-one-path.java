class Solution{
    public String[] createGrid(int m, int n){
        String []ans=new String[m];
        int idx=0;
        for(int i=0;i<m;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if(i==0) sb.append(".");
                else if(i>0 && j==n-1){
                    sb.append(".");
                }
                else{
                    sb.append("#");
                }
            }
            ans[idx++]=sb.toString();
        }
        return ans;
    }
}