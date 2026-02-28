class Solution{
    public int subarraySum(int[] nums, int k){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int target=prefix-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}