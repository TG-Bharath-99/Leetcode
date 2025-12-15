class Solution{
    public String decodeString(String string){
        Stack<String>s=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch : string.toCharArray()){
            if(ch==']'){
                StringBuilder curr=new StringBuilder();
                while(!s.peek().equals("[")){
                    curr.insert(0,s.pop());
                }
                s.pop();
                StringBuilder num=new StringBuilder();
                while(!s.isEmpty() && Character.isDigit(s.peek().charAt(0))){
                    num.insert(0,s.pop());
                }
                int k=Integer.parseInt(num.toString());
                String r=curr.toString().repeat(k);
                s.push(r);
            }
            else{
                s.push(String.valueOf(ch));
            }
        }
        for(String str : s){
            sb.append(str);
        }
        return sb.toString();
    }
}