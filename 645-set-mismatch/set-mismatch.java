class Solution{
    public int[] findErrorNums(int[] nums){
        int d=-1,m=-1;
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0){
                d=idx+1;
            }
            else
            nums[idx]=-nums[idx];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                m=i+1;
                break;
            }
        }
        return new int[]{d,m};
    }
}