class Solution{
    public List<Integer> findAnagrams(String s, String p){
        if(p.length()>s.length()) return new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int []need=new int[26];
        for(char ch : p.toCharArray()){
            need[ch-'a']++;
        }
        int []window=new int[26];
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            window[ch-'a']++;
            if(right>=p.length()){
                window[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(window,need)){
                ans.add(right-p.length()+1);
            }
        }
        return ans;
    }
}