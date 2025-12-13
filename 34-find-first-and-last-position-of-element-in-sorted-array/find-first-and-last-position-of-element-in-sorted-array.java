class Solution{
    public int[] searchRange(int[] nums, int target){
        int []ans={-1,-1};
        int low1=0,high1=nums.length-1;
        while(low1<=high1){
            int mid=low1+(high1-low1)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                high1=mid-1;
            }
            else if(nums[mid]>target){
                high1=mid-1;
            }
            else{
                low1=mid+1;
            }
        }
        int end=-1;
        int low2=0,high2=nums.length-1;
        while(low2<=high2){
            int mid=low2+(high2-low2)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                low2=mid+1;
            }
            else if(nums[mid]>target){
                high2=mid-1;
            }
            else{
                low2=mid+1;
            }
        }
        return ans;
    }
}