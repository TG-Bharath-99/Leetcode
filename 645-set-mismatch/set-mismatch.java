class Solution{
    public int[] findErrorNums(int[] nums){
        int []ans=new int[2];
        int k=0;
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                ans[k++]=i;
            }
            else{
                sum+=i;
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int asum=nums.length*(nums.length+1)/2;
        ans[k]=asum-sum;
        return ans;
    }
}