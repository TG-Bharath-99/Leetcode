class Solution{
    public int findMin(int[] nums){
        int n=nums.length;
        if(nums[0]<nums[n-1]){
            return nums[0];
        }
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else if(nums[mid]<nums[high]){
                high=mid;
            }
        }
        return nums[low];
    }
}