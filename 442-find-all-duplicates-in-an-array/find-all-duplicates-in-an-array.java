class Solution{
    public List<Integer> findDuplicates(int[] nums){
        List<Integer>ans=new ArrayList<>();
        for(int i : nums){
            int k=Math.abs(i)-1;
            if(nums[k]<0){
                ans.add(k+1);
            }
            nums[k]=-nums[k];
        }
        return ans;
    }
}