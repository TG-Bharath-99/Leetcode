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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root){
        if(root==null){
            return d;
        }
        height(root);
        return d;
    }
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int dia=left+right;
        d=Math.max(d,dia);
        return Math.max(left,right)+1;
    }
}