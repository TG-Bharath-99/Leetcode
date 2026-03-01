class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int num=nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=num+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(num,nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}