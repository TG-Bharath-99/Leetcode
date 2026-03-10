class Solution{
    public int numberOfSubarrays(int[] nums, int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                nums[i]=1;
            }
            else{
                nums[i]=0;
            }
        }
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for(int i : nums){
            sum+=i;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}