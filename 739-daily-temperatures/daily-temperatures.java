class Solution{
    public int[] dailyTemperatures(int[] nums){
        Stack<Integer>s=new Stack<>();
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!s.isEmpty() && nums[i]>nums[s.peek()]){
                ans[s.peek()]=i-s.pop();
            }
            s.push(i);
        }
        return ans;
    }
}