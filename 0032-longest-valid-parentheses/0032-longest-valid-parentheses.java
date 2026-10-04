class Solution{
    public int longestValidParentheses(String str){
        if(str.isEmpty()){
            return 0;
        }

        Stack<Integer>s=new Stack<>();
        int start=-1;
        int ans=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                s.push(i);
            }
            else{
                if(!s.isEmpty()){
                    s.pop();
                    if(s.isEmpty()){
                        ans=Math.max(ans,i-start);
                    }
                    else{
                        ans=Math.max(ans,i-s.peek());
                    }
                }
                else{
                    start=i;
                }
                
            }
        }
        return ans;
    }
}