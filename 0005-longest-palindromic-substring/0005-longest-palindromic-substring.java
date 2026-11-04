class Solution{
    boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s){
        if(s.length()==0) return "";
        if(s.length()==1) return s;
        int start=-1;
        int end=-1;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    if(start==-1 && end==-1){
                        start=i;
                        end=j;
                    }
                    else if(j-i>end-start){
                        start=i;
                        end=j;
                    }
                }
            }
        }
        if(start==-1 && end==-1) return "";
        return s.substring(start,end);
    }
}