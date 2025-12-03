class Solution {
    static ArrayList<String> helper(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String>ans=new ArrayList<>();
        if(digit==7){
            for(int i=(digit-2)*3;i<=(digit-1)*3;i++){
            char ch=(char)('a'+i);
            ArrayList<String>list=helper(p+ch,up.substring(1));
            ans.addAll(list);
        }
        }
        else if(digit==8){
            for(int i=((digit-2)*3)+1;i<=(digit-1)*3;i++){
            char ch=(char)('a'+i);
            ArrayList<String>list=helper(p+ch,up.substring(1));
            ans.addAll(list);
        }
        }
        else if(digit==9){
            for(int i=1+((digit-2)*3);i<=1+((digit-1)*3);i++){
            char ch=(char)('a'+i);
            ArrayList<String>list=helper(p+ch,up.substring(1));
            ans.addAll(list);
        }
        }
        else{
            for(int i=(digit-2)*3;i<(digit-1)*3;i++){
            char ch=(char)('a'+i);
            ArrayList<String>list=helper(p+ch,up.substring(1));
            ans.addAll(list);
        }
        }
        return ans;
    }
    public List<String> letterCombinations(String digits){
        if(digits.isEmpty()) return null;
        return helper("",digits);
    }
}