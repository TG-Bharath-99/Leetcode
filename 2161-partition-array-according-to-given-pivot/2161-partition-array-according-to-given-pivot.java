class Solution{
    public int[] pivotArray(int[] nums, int pivot){
        int []ans=new int[nums.length];
        int index=0;
        for(int num : nums){
            if(num<pivot) ans[index++]=num;
        }
        for(int num : nums){
            if(num==pivot) ans[index++]=num;
        }
        for(int num : nums){
            if(num>pivot) ans[index++]=num;
        }
        return ans;
    }
}