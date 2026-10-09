class Solution{
    public int minInsertions(String str){
        int open=0;
        int close=0;
        int ans=0;
        for(char ch : str.toCharArray()){
            if(ch=='('){
                if(close>0){
                    if(open>0){
                        ans++;
                        open--;
                        close--;
                    }
                    else{
                        ans+=2;
                        close--;
                    }
                }
                open++;
            }
            else{
                close++;
                if(close>=2){
                    if(open>0){
                        close-=2;
                        open--;
                    }
                    else{
                        ans++;
                        close-=2;
                    }
                }
            }
        }
        if(open==close) ans+=open;
        else if(open>close){
            ans+=(open-close)+open;
        }
        else{
            ans+=(close-open)+close;
        }
        return ans;
    }
}