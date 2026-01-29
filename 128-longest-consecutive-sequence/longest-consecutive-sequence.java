class Solution{
    public int longestConsecutive(int[] nums){
        HashSet<Integer>set=new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ans=0;
        for(int i : set){
            if(!set.contains(i-1)){
                int l=0;
                int k=i;
            while(set.contains(k)){
                l++;
                k++;
            }
            ans=Math.max(ans,l);
        }
        }
        return ans;
        }
}