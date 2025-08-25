class Solution {
    public boolean checkIfExist(int[] arr){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int i : arr) {
            if (i == 0) {
                if (map.get(i) > 1) return true; 
                            } else if (map.containsKey(i * 2)) {
                return true;
            }
        }
        return false;
    }
}