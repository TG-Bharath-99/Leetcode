class Solution{
    public int subarraysWithKDistinct(int[] nums, int k){
        return atMost(nums,k)-atMost(nums,k-1);
    }
    int atMost(int []nums,int k){
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}