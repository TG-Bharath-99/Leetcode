class Solution {
    public boolean isSubsequence(String s, String t){
        if(t.contains(s)) return true;
        if(s.equals("") || t.equals("")) return false;
        int i=0,j=0,count=0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                i++;
                j++;
                count++;
            }else{
                i++;
            }
        }
        return count==s.length();
    }
}