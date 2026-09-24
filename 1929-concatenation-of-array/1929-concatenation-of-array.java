class Solution{
    public int[] getConcatenation(int[] nums){
        int []ans=new int[2*nums.length];
        int m=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[m++]=nums[i];
        }
        return ans;
    }
}