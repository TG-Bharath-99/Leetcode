class Solution{
    public int lengthOfLongestSubstring(String s){
        Set<Character>set=new HashSet<>();
        int ans=0;
        int left=0;
        int right=0;
        for(char ch : s.toCharArray()){
            while(set.contains(ch)){
                set.remove(s.charAt(left++));
            }
            set.add(ch);
            ans=Math.max(ans,(right-left+1));
            right++;
        }
        return ans;
    }
}