class Solution{
    int ans=0;
    void fun(String s,int k){
        int cnt=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
        }
        if(cnt==k){
            ans++;
        }
    }
    public int countRotations(String s, int k){
        int n=s.length();
        for(int i=0;i<n;i++){
            fun(s.substring(i,n)+s.substring(0,i),k);
        }
        return ans;
    }
}