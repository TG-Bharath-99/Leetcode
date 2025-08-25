class Solution {
    public int firstMissingPositive(int[] nums){
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
        int len=list.size();
        int k;
        list.removeIf(n->n==0);
        list.removeIf(n->n<0);
        Set<Integer>set=new HashSet<>(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list);
        if(list.size()==0){
            return 1;
        }
        if(list.size()==1){
            if(list.get(0)==1){
                return 2;
            }
            else{
                return 1;
            }
        }
        if(list.get(0)>1){
            return 1;
        }
        if(list.size()==list.get(list.size()-1)){
            return list.size()+1;
        }
        k=list.get(0);
        for(int i=0;i<len;i++){
            map.put(k+i,map.getOrDefault(k+i,0)+1);
        }
        for(int i:list){
            if(map.containsKey(i)){
                map.remove(i);
            }
        }
        List<Integer>newlist=new ArrayList<>(map.keySet());
        Collections.sort(newlist);
        return newlist.get(0);
    }
}