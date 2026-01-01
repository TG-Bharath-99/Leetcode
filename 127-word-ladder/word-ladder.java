class Solution{
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String>set=new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return 0;
        }        
        Queue<String>q=new LinkedList<>();
        q.offer(beginWord);
        int length=0;
        while(!q.isEmpty()){
            int size=q.size();
            length++;
            for(int i=0;i<size;i++){
                String current=q.poll();
                for(int j=0;j<current.length();j++){
                    char []temp=current.toCharArray();
                    char original=temp[j];
                    for(char ch='a';ch<='z';ch++){
                        if(ch==original){
                            continue;
                        }
                        temp[j]=ch;
                        String s=new String(temp);
                        if(s.equals(endWord)){
                            return length+1;
                        }
                        if(set.contains(s)){
                            q.offer(s);
                            set.remove(s);
                        }
                    }
                    temp[j]=original;
                }
            }
        }
        return 0;
    }
}