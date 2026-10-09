class Solution{
    public String removeOuterParentheses(String s){
        int open=0;
        int close=0;
        int idx=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
                sb.append(ch);
            }
            else if(ch==')'){
                close++;
                sb.append(ch);
            }
            if(open>0 && open==close){
                sb.deleteCharAt(idx);
                sb.deleteCharAt(sb.length()-1);
                open=0;
                close=0;
                idx=sb.length()+1;
            }
        }
        return sb.toString();
    }
}