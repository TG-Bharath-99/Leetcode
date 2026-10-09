class Solution{
    boolean isValid(String s){
        int balance=0;
        for(char ch : s.toCharArray()){
            if(ch=='(') balance++;
            else if(ch==')') balance--;
            if(balance<0) return false;
        }
        return balance==0;
    }
    public List<String> removeInvalidParentheses(String s){
        Queue<String>q=new LinkedList<>();
        Set<String>set=new HashSet<>();
        List<String>ans=new ArrayList<>();
        boolean found=false;
        q.offer(s);
        set.add(s);
        while(!q.isEmpty()){
            if(found) return ans;
            int size=q.size();
            for(int i=0;i<size;i++){
                String temp=q.poll();
                if(isValid(temp)){
                    ans.add(temp);
                    found=true;
                }
                else{
                    for(int j=0;j<temp.length();j++){
                        if(temp.charAt(j)!='(' && temp.charAt(j)!=')')continue;
                        String next=temp.substring(0,j)+temp.substring(j+1,temp.length());
                        if(set.add(next)){
                            q.offer(next);
                        }
                    }
                }
            }
        }
        return ans;
    }
}