class Solution{
    void compare(char []arr,Stack<Character>s){
        for(char ch : arr){
            if(ch!='#'){
                s.push(ch);
            }
            else if(!s.isEmpty() && ch=='#'){
                s.pop();
            }
        }
    }
    public boolean backspaceCompare(String s, String t){
        Stack<Character>s1=new Stack<>();
        Stack<Character>s2=new Stack<>();
        compare(s.toCharArray(),s1);
        compare(t.toCharArray(),s2);
        return s1.equals(s2);
    }
}