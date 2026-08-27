class Solution{
    public int findPairs(int[] nums, int k){
        Map<Integer,Integer>map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int num : map.keySet()){
            if(k==0){
                if(map.get(num)>=2){
                    ans++;
                }
            }
            else{
                if(map.containsKey(num+k)){
                    ans++;
                }
            }
        }
        return ans;
    }
}