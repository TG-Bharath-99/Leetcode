class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans=-1;
        int n=nums.length;
        int []des=new int[n];
        des[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            des[i]=Math.min(des[i+1],nums[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            int min=des[i];
            if(max-min<=k){
                ans=i;
                break;
            }
        }
        return ans;
    }
}