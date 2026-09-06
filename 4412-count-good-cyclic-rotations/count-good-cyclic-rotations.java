class Solution{
    public int countGoodRotations(int[] nums){
        int n=nums.length;
        long []prefix=new long[n];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long firstSum=0;
            long secondSum=0;
            if(i==0){
                firstSum=prefix[(((n/2)+i)-1)%n];
            }
            else{
                if(i<=(n/2)){
                    firstSum=prefix[(((n/2)+i)-1)%n]-prefix[(i-1)%n];
                }
                else{
                    firstSum=prefix[(n-1)%n]-prefix[(i-1)]+prefix[(i-(n/2)-1)%n];
                }
            }
            secondSum=prefix[((n-1)%n)]-firstSum;
            System.out.println(firstSum);
            System.out.println(secondSum);
            if(firstSum>secondSum){
                ans++;
            }
        }
        return ans;
    }
}