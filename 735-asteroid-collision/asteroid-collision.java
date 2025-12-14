class Solution{
    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer>s=new Stack<>();
        for(int i : asteroids){
            if(i>0){
                s.push(i);
            }
            else{
                while(!s.isEmpty() && s.peek()>0 && s.peek()<-i){
                    s.pop();
                }
                if(s.isEmpty() || s.peek()<0){
                    s.push(i);
                }
                if(s.peek()==-i){
                    s.pop();
                }
            }
        }
        int []ans=new int[s.size()];
        int i=0;
        for(int num : s){
            ans[i++]=num;
        }
        return ans;
    }
}