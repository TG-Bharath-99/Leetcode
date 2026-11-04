class Solution{
    int expand(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
    public String longestPalindrome(String s){
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int odd=expand(s,i,i);
            int even=expand(s,i,i+1);
            int len=Math.max(odd,even);
            if(len>end-start+1){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
}