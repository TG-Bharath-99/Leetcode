class Solution{
    public char findTheDifference(String s, String t){
        List<Character>list=new ArrayList<>();
        for(char ch : t.toCharArray()){
            list.add(ch);
        }
        for(char ch : s.toCharArray()){
            if(list.contains(Character.valueOf(ch))){
                list.remove(Character.valueOf(ch));
            }
        }
        return list.get(0);
    }
}