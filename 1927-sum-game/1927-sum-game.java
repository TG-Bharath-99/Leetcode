class Solution{
    public boolean sumGame(String num){
        int sum1=0,sum2=0,q1=0,q2=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?') q1++;
            else sum1+=num.charAt(i)-'0';
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?') q2++;
            else sum2+=num.charAt(i)-'0';
        }
        return 2*(sum1-sum2)!=9*(q2-q1);
    }
}