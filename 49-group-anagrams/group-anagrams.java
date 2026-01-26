class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>>map=new HashMap<>();
        for(String s : strs){
            int []freq=new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i : freq){
                sb.append(i).append("*");
                System.out.println(sb.toString());
            }
            map.computeIfAbsent(sb.toString(),k->new ArrayList()).add(s);
        }
        return new ArrayList(map.values());
    }
}