class Solution{
    public void visit(List<List<Integer>> rooms,int key,boolean []visited){
        visited[key]=true;
        for(int nextkey : rooms.get(key)){
            if(!visited[nextkey]){
                visit(rooms,nextkey,visited);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        boolean []visited=new boolean[rooms.size()];
        visit(rooms,0,visited);
        for(boolean b : visited){
            if(!b) return false;
        }
        return true;
    }
}