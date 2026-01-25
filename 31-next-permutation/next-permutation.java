class Solution{
    public void nextPermutation(int[] nums){
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
        }
        reverse(nums,i+1,n-1);
    }
    void reverse(int []arr,int i,int j){
        while(i<j){
            arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
            i++;
            j--;
        }
    }
}