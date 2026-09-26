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
    List<Integer>list=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2){
        DFS1(root1);
        DFS2(root2);
        return list.size()==0;
    }
    void DFS1(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        DFS1(root.left);
        DFS1(root.right);
    }
    void DFS2(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(list.size()==0 || list.get(0)!=root.val){
                list.add(-1);
                return;
            }
            list.remove(0);
        }
        DFS2(root.left);
        DFS2(root.right);
    }
}