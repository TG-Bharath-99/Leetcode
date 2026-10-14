class Solution{
    public String maxSumOfSquares(int num, int sum){
        if(num>0 && sum==0) return "";
        if(sum>9*num) return "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;i++){
            if(sum==0){
                sb.append(0);
            }
            else if(sum<10){
                sb.append(sum);
                sum=0;
            }
            else{
                sb.append(9);
                sum-=9;
            }
        }
        return sb.toString();
    }
}