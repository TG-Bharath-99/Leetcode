class Solution{
    public String shortestBeautifulSubstring(String s, int k){
        int left=0;
        int ones=0;
        String ans="";
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1') ones++;
            while(left<=right && ones>k){
                if(s.charAt(left)=='1'){
                    ones--;
                }
                left++;
            }
            while(left<=right && s.charAt(left)=='0') left++;
            if(ones==k){
                String current=s.substring(left,right+1);
                if(ans.equals("") || current.length()<ans.length() ||
                    (current.length() == ans.length() &&
                     current.compareTo(ans) < 0)){
                    ans=current;
                }
            }
        }
        return ans;
    }
}