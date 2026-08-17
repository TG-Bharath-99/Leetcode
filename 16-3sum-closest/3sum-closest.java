class Solution{
    public int threeSumClosest(int[] nums, int target){
        int minans=Integer.MIN_VALUE;
        int maxans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    minans=Math.max(minans,sum);
                    left++;
                }
                else{
                    maxans=Math.min(maxans,sum);
                    right--;
                }
            }
        }
        if(minans==Integer.MIN_VALUE) return maxans;
        if(maxans==Integer.MAX_VALUE) return minans;
        if(Math.abs(target-minans)<Math.abs(target-maxans)){
            return minans;
        }
        return maxans;
    }
}