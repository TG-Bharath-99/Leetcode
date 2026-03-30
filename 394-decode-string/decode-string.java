class Solution{
    public String decodeString(String s){
        Stack<String>ch=new Stack<>();
        Stack<Integer>in=new Stack<>();
        String curr="";
        int num=0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                ch.push(curr);
                in.push(num);
                curr="";
                num=0;
            }
            else if(c==']'){
                String prev=ch.pop();
                int count=in.pop();
                String temp="";
                for(int i=0;i<count;i++){
                    temp+=curr;
                }
                curr=prev+temp;
            }
            else{
                curr+=c;
            }
        }
        return curr;
    }
}