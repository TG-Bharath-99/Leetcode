class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(int i:nums1){
            if(set2.contains(i)){
                set1.remove(i);
                set2.remove(i);
            }
        }
        List<List<Integer>>list=new ArrayList<>();
        list.add(new ArrayList<>(set1));
        list.add(new ArrayList<>(set2));
        return list;
    }
}