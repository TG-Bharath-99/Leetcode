class Solution{
    boolean check(int num,int i){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum==i;
    }
    public int smallestIndex(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(check(nums[i],i)){
                return i;
            }
        }
        return -1;
    }
}