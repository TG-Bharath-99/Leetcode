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
    public int goodNodes(TreeNode root){
        return inorder(root,root.val);
    }
    static int inorder(TreeNode root,int target){
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.val>=target){
            count=1;
        }
        target=Math.max(target,root.val);
        count+=inorder(root.left,target);
        count+=inorder(root.right,target);
        return count;
    }
}