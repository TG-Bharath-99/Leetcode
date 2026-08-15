class Solution{
    public String minWindow(String s, String t){
        if(t.length()>s.length()){
            return "";
        }
        int minLen=Integer.MAX_VALUE;
        int startIndex=-1;
        int []freq=new int[256];
        int left=0;
        int cnt=0;
        for(char ch : t.toCharArray()) freq[ch]++;
        for(int right=0;right<s.length();right++){
            if(freq[s.charAt(right)]>0){
                cnt++;
            }
            freq[s.charAt(right)]--;
            while(cnt==t.length()){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    startIndex=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    cnt--;
                }
                left++;
            }
        }
        return (startIndex==-1)?"":s.substring(startIndex,startIndex+minLen);
    }
}