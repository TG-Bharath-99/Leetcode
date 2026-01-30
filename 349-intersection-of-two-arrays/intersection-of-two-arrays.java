class Solution{
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for( int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            if(set1.contains(x)){
                set2.add(x);
            }
        }
        int []ans=new int[set2.size()];
        int k=0;
        for(int i : set2){
            ans[k++]=i;
        }
        return ans;
    }
}