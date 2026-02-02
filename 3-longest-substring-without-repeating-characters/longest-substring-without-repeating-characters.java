class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l,map.get(ch)+1);
            }
            map.put(ch,r);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}