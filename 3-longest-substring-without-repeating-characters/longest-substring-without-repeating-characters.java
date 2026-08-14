class Solution{
    public int lengthOfLongestSubstring(String s){
        int ans=0;
        Set<Character>set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans=Math.max(ans,set.size());
        }
        return ans;
    }
}