class Solution{
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] buckets=new ArrayList[nums.length+1];
        for(int key : map.keySet()){
            int freq=map.get(key);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=buckets.length-1;i>=0 && ans.size()<k;i--){
            if(buckets[i]!=null){
                ans.addAll(buckets[i]);
            }
        }
        ans=ans.subList(0,k);
        int s=0;
        int []l=new int[k];
        for(int i : ans){
            l[s++]=i;
        }
        return l;
    }
}