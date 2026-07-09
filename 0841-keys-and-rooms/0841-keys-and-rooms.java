class Solution{
    public void visit(List<List<Integer>>rooms,int key,boolean []visited,Set<Integer>set){
        visited[key]=true;
        set.add(key);
        for(int nextkey : rooms.get(key)){
            if(!visited[nextkey])
             visit(rooms,nextkey,visited,set);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        if(rooms.size()==0 || rooms.size()==1) return true;
        Set<Integer>set=new HashSet<>();
        int x=0;
        set.add(x);
        boolean []visited=new boolean[rooms.size()];
        visited[0]=true;
        for(List<Integer>list : rooms){
            if(set.contains(x))
            for(int key : list){
                visit(rooms,key,visited,set);
            }
            x++;
        }
        for(boolean b : visited){
            if(!b) return false;
        }
        return true;
    }
}