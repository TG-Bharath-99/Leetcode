class Solution{
    void swap(int []nums,int l,int r){
        while(l<=r){
            nums[l]=nums[l]+nums[r]-(nums[r]=nums[l]);
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k){
        int n=nums.length;
        k%=n;
        swap(nums,0,n-k-1);
        swap(nums,n-k,n-1);
        swap(nums,0,n-1);
    }
}