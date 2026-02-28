class Solution{
    public int lengthOfLongestSubstring(String s){
        int ans=0;
        Set<Character>set=new HashSet<>();
        int left=0,right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left++));
            }
            set.add(ch);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}