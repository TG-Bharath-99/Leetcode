class Solution{
    public int minAddToMakeValid(String str){
        int open=0;
        int close=0;
        int ans=0;
        for(char ch : str.toCharArray()){
            if(ch=='('){
                open++;
            }
            else{
                close++;
                if(close>open){
                    ans++;
                    close--;
                } 
            }
        }
        ans+=Math.abs(open-close);
        return ans;
    }
}