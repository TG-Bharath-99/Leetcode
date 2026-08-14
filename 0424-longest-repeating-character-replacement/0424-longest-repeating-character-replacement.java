class Solution{
    public int characterReplacement(String s, int k){
        int ans=0;
        int maxfreq=0;
        int []freq=new int[26];
        int left=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(freq[s.charAt(right)-'A'],maxfreq);
            while(right-left+1-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}