class Solution{
    public void sortColors(int[] nums){
        int start=0,end=nums.length-1;
        int mid=0;
        while(mid<=end){
            if(nums[mid]==0){
                nums[mid]=nums[mid]+nums[start]-(nums[start]=nums[mid]);
                mid++;
                start++;
            }
            else if(nums[mid]==2){
                nums[mid]=nums[mid]+nums[end]-(nums[end]=nums[mid]);
                end--;
            }
            else{
                mid++;
            }
        }
    }
}