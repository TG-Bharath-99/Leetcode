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
    boolean ans=true;
    public boolean isSymmetric(TreeNode root){
        DFS(root.left,root.right);
        return ans;
    }
    void DFS(TreeNode left,TreeNode right){
        if(left==null && right==null) return;
        if(left==null || right==null){
            ans=false;
            return;
        }
        if(left.val!=right.val){
            ans=false;
        }
        DFS(left.left,right.right);
        DFS(left.right,right.left);
    }
}