class Solution{
    public boolean checkSubarraySum(int[] nums, int k){
        if(nums.length<2){
            return false;
        }
        int len=2;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int target=sum%k;
            if(map.containsKey(target)){
                if(i-map.get(target)>=len){
                    return true;
                }
            }
            if(!map.containsKey(target)){
                map.put(target,i);
            }
        }
        return false;
    }
}