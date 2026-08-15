class Solution{
    public List<Integer> findAnagrams(String s, String p){
        List<Integer>ans=new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        int []need=new int[26];
        int []window=new int[26];
        for(char ch : p.toCharArray()){
            need[ch-'a']++;
        }
        int k=p.length();
        for(int i=0;i<s.length();i++){
            window[s.charAt(i)-'a']++;
            if(i>=k){
                window[s.charAt(i-k)-'a']--;
            }
            if(Arrays.equals(need,window)){
                ans.add(i-k+1);
            }
        }
        return ans;
    }
}