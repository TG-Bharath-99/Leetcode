class Solution{
    public void rotate(int[] nums, int k){
        int n=nums.length;
        if(k==0){
            return;
        }
        k=k%n;
        L(nums,n-k,n-1);
        L(nums,0,n-k-1);
        L(nums,0,n-1);
    }
    public void L(int []nums,int i,int j){
        if(i==j) return;
        while(i<j){
            nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
            i++;
            j--;
        }
    }
}