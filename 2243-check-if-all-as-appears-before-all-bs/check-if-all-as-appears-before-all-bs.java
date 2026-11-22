class Solution{
    public boolean checkString(String s){
        boolean b=false;
        for(char ch : s.toCharArray()){
            if(ch=='b'){
                b=true;
            }
            if(ch=='a' && b){
                return false;
            }
        }
        return true;
    }
}