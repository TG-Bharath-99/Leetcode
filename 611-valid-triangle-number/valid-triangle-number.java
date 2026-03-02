class Solution{
    public int triangleNumber(int[] nums){
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=2;i--){
            int j=i-1;
            int k=0;
            while(j>k){
                int x=nums[j]+nums[k];
                if(x>nums[i]){
                    count+=(j-k);
                    j--;
                }
                else{
                    k++;
                }
            }
        }
        return count;
    }
}