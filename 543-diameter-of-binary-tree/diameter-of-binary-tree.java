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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root){
        findDiameter(root);
        return diameter-1;
    }
    int findDiameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=findDiameter(root.left);
        int right=findDiameter(root.right);
        int dia=left+right+1;
        diameter=Math.max(diameter,dia);
        return 1+Math.max(left,right);
    }
}