class Solution{
    Set<Integer>set=new HashSet<>();
    void permute(int []digits,int index,int sum){
        if(index==3){
            if(sum%2==0){
                set.add(sum);
            }
            return;
        }
        for(int i=index;i<digits.length;i++){
            if(index==0 && digits[i]==0){
                continue;
            }
            int temp=digits[i];
            digits[i]=digits[index];
            digits[index]=temp;
            permute(digits,index+1,sum*10+digits[index]);
            temp=digits[i];
            digits[i]=digits[index];
            digits[index]=temp;
        }
    }
    public int totalNumbers(int[] digits){
        permute(digits,0,0);
        return set.size();
    }
}