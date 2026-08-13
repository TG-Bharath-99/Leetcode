class Solution{
    public boolean isPalindrome(String s){
        s=s.trim();
        if(s.equals("")) return true;
        int i=0,j=s.length()-1;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(!(ch1>='A' && ch1<='Z') && !(ch1>='a' && ch1<='z') && !(ch1>=48 && ch1<=57)){
                i++;
                continue;
            }
            if(!(ch2>='A' && ch2<='Z') && !(ch2>='a' && ch2<='z') && !(ch2>=48 && ch2<=57)){
                j--;
                continue;
            }
            if(!(Character.toLowerCase(ch1)==Character.toLowerCase(ch2))) return false;
            i++;
            j--;
        }
        return true;
    }
}