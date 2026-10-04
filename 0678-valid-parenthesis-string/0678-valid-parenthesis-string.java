class Solution{
    public boolean checkValidString(String str){
        if(str.isEmpty()) return true;
        if(str.charAt(0)==')') return false;
        int open=0;
        int star=0;
        for(char ch : str.toCharArray()){
            if(ch=='(') open++;
            else if(ch=='*') star++;
            else{
                if(open>0) open--;
                else if(star>0) star--;
                else return false;
            }
        }
        
        if(str.charAt(str.length()-1)=='(') return false;
        int close=0;
        star=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch==')') close++;
            else if(ch=='*') star++;
            else{
                if(close>0) close--;
                else if(star>0) star--;
                else return false;
            }
        }
        return true;
    }
}