class Solution {
    public void rotate(int[] nums, int k){
        int n=nums.length;
        if(n<=1){
            return;
        }
        k=k%n;
        if(k==0){
            return;
        }
        for(int i=0;i<(n-k)/2;i++){
            int j=(n-k)-1-i;
            nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
        }
        for(int i=0;i<k/2;i++){
            int j=n-1-i;
            nums[n-k+i]=nums[n-k+i]+nums[j]-(nums[j]=nums[n-k+i]);
        }
        for(int i=0;i<n/2;i++){
            nums[i]=nums[i]+nums[n-1-i]-(nums[n-1-i]=nums[i]);
        }
    }
}