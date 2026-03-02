class Solution{
    public int characterReplacement(String s, int k){
        int ans=0;
        int maxfreq=0;
        int left=0;
        int maxlen=0;
        int []freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(i)-'A']);
            while((i-left+1-maxfreq)>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxfreq,i-left+1);
        }
        return maxlen;
    }
}