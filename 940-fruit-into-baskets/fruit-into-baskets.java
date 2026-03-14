class Solution{
    public int totalFruit(int[] fruits){
        Map<Integer,Integer>map=new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            ans=Math.max(right-left+1,ans);
        }
        return ans;
    }
}