class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,l=0;
        Set<Character>set=new HashSet<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}