class Solution{
    public int[] intersect(int[] nums1, int[] nums2){
        List<Integer>set=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                ans.add(i);
                set.remove(Integer.valueOf(i));
            }
        }
        int []res=new int[ans.size()];
        int k=0;
        for(int i : ans){
            res[k++]=i;
        }
        return res;
    }
}