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
    public boolean isValidBST(TreeNode root){
        return helprt(root,null,null);
    }
    boolean helprt(TreeNode root,TreeNode low,TreeNode high){
        if(root==null){
            return true;
        }
        if(low!=null && root.val<=low.val){
            return false;
        }
        if(high!=null && root.val>=high.val){
            return false;
        }
        return helprt(root.left,low,root) && helprt(root.right,root,high);
    }
}