class Solution{
    public boolean checkInclusion(String s1, String s2){
        int []freq=new int[26];
        for(char ch : s1.toCharArray()) freq[ch-'a']++;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int []temp=freq.clone();
            int count=0;
            int j=i;
            while(j<s2.length() && temp[s2.charAt(j)-'a']!=0){
                temp[s2.charAt(j)-'a']--;
                count++;
                j++;
            }
            if(count==s1.length()) return true;
        }
        return false;
    }
}