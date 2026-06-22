/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution{
    Map<Integer,List<int[]>>map=new TreeMap<>();
    List<List<Integer>>ans=new LinkedList<>();
    public List<List<Integer>>verticalTraversal(TreeNode root){
        DFS(root,0,0);
        for(List<int[]>list: map.values()){
            Collections.sort(list,(a,b)->{
                if(a[0]!=b[0]){
                    return a[0]-b[0];
                }
                return a[1]-b[1];
            });
            List<Integer>temp=new ArrayList<>();
            for(int []x:list){
                temp.add(x[1]);
            }
            ans.add(temp);
        }
        return ans;
    }
    public void DFS(TreeNode root,int row,int col){
        if(root==null){
            return;
        }
        map.putIfAbsent(col,new ArrayList<>());
        map.get(col).add(new int[]{row,root.val});
        DFS(root.left,row+1,col-1);
        DFS(root.right,row+1,col+1);
    }
}