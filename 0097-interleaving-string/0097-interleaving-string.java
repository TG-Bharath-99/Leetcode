class Solution{
    boolean fun(String s1,String s2,String s3,int i1,int i2,int i3,int [][]dp){
        if(i3==s3.length()){
            return i1==s1.length() && i2==s2.length();
        }
        if(i1<s1.length() && i2<s2.length()){
            if(dp[i1][i2]!=-1){
            if(dp[i1][i2]==1) return true;
            return false;
        }
        }
        boolean left=false;
        boolean right=false;
        if(i1<s1.length() && s1.charAt(i1)==s3.charAt(i3)){
            left=fun(s1,s2,s3,i1+1,i2,i3+1,dp);
        }
        if(i2<s2.length() && s2.charAt(i2)==s3.charAt(i3)){
            right=fun(s1,s2,s3,i1,i2+1,i3+1,dp);
        }
        boolean ans=left||right;
        if(i1<s1.length() && i2<s2.length()){
            dp[i1][i2]=ans?1:0;
        }
        return ans;
    }
    public boolean isInterleave(String s1, String s2, String s3){
        if(s1.length()+s2.length()!=s3.length()) return false;
        int [][]dp=new int[s1.length()][s2.length()];
        for(int []row : dp){
            Arrays.fill(row,-1);
        }
        return fun(s1,s2,s3,0,0,0,dp);
    }
}