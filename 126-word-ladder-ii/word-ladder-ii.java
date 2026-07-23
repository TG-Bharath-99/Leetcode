class Solution{
    List<List<String>>ans=new ArrayList<>();
    Map<String,List<String>>map=new HashMap<>();
    void dfs(List<String>list,String stop,String word){
        list.add(word);
        if(word.equals(stop)){
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        if(!map.containsKey(word)) return;
        for(String key : map.get(word)){
            dfs(list,stop,key);
        }
        list.remove(list.size()-1);
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList){
        Queue<String>q=new LinkedList<>();
        Set<String>set=new HashSet<>(wordList);
        if(!set.contains(endWord)) return new ArrayList<>();
        q.offer(beginWord);
        boolean found=false;
        while(!q.isEmpty()){
            Set<String>levelVisited=new HashSet<>();
            int size=q.size();
            while(size-->0){
                String curr=q.poll();
            char []arr=curr.toCharArray();
            for(int i=0;i<arr.length;i++){
                char original=arr[i];
                for(char ch='a';ch<='z';ch++){
                    if(ch==original) continue;
                    arr[i]=ch;
                    String next=new String(arr);
                    if(set.contains(next)){
                        if(next.equals(endWord)) found=true;
                        if (!levelVisited.contains(next)) {
                             q.offer(next);
                             levelVisited.add(next);
                             }
                        map.putIfAbsent(next,new ArrayList<>());
                        map.get(next).add(curr);
                    }
                }
                arr[i]=original;
            }
            }
            for(String s : levelVisited) set.remove(s);
            if(found) break;
        }
        List<String>list=new ArrayList<>();
        dfs(list,beginWord,endWord);
        for(List<String>temp : ans){
            Collections.reverse(temp);
        }
        return ans;
    }
}