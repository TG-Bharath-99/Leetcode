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
    boolean ans=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        DFS(root,subRoot);
        return ans;
    }
    void DFS(TreeNode root,TreeNode subRoot){
        if(root==null){
            return;
        }
        if(isSubTree(root,subRoot)){
            ans=true;
        }
        DFS(root.left,subRoot);
        DFS(root.right,subRoot);
    }
    boolean isSubTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSubTree(p.left,q.left) && isSubTree(p.right,q.right);
    }
}