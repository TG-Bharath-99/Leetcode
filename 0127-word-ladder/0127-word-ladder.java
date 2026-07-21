class Solution{
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String>set=new HashSet(wordList);
        Queue<String>q=new LinkedList<>();
        int count=1;
        q.offer(beginWord);
        set.remove(beginWord);
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                String curr=q.poll();
                if(curr.equals(endWord)) return count;
                char []arr=curr.toCharArray();
                for(int i=0;i<arr.length;i++){
                    char original=arr[i];
                    for(char ch='a';ch<='z';ch++){
                        if(ch==original) continue;
                        arr[i]=ch;
                        String next=new String(arr);
                        if(set.contains(next)){
                            q.offer(next);
                            set.remove(next);
                        }
                    }
                arr[i]=original;
                }
            }
            count++;
        }
        return 0;
    }
}