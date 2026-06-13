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
    public void flatten(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp=root;
        while(temp!=null){
            if(temp.left!=null){
                TreeNode curr=temp.left;
                while(curr.right!=null){
                    curr=curr.right;
                }
                curr.right=temp.right;
                temp.right=temp.left;
                temp.left=null;
            }
            temp=temp.right;
        }
    }
}