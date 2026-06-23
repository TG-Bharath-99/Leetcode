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
    Integer prev=null;
    int ans=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root){
        inorder(root);
        return ans;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null){
            ans=Math.min(ans,root.val-prev);
        }
        prev=root.val;
        inorder(root.right);
    }
}