class Solution{
    public int lengthOfLongestSubstring(String s){
        if(s.equals("")) return 0;
        int ans=Integer.MIN_VALUE;
        int left=0;
        int []freq=new int[256];
        for(int right=0;right<s.length();right++){
            while(freq[s.charAt(right)]>0){
                freq[s.charAt(left)]--;
                left++;
            }
            freq[s.charAt(right)]++;
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}