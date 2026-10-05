class Solution{
    public int scoreOfParentheses(String str){
        int score=0;
        Stack<Integer>s=new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='('){
                s.push(score);
                score=0;
            }
            else{
                if(score==0){
                    score=1;
                }
                else{
                    score=2*score;
                }
                score=s.pop()+score;
            }
        }
        return score;
    }
}