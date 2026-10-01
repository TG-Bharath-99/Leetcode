class Solution{
    public boolean isValid(String str){
        Stack<Character>s=new Stack<>();
        for(char ch : str.toCharArray()){
            if(s.isEmpty() || ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else if((ch==')' && s.peek()=='(') || (ch==']' && s.peek()=='[') || (ch=='}' && s.peek()=='{')){
                s.pop();
            }
            else{
                s.push(ch);
            }
        }
        return s.isEmpty();
    }
}