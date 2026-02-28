class Solution{
    public int numberOfSubarrays(int[] nums, int k){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
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