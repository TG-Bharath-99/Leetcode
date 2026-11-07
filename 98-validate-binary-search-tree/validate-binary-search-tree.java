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
    public boolean isValidBST(TreeNode root){
        DFS(root,Long.MIN_VALUE,Long.MAX_VALUE);
        return ans;
    }
    void DFS(TreeNode root,long min,long max){
        if(root==null) return;
        if(root.val<=min || root.val>=max){
            ans=false;
            return;
        }
        DFS(root.left,min,root.val);
        DFS(root.right,root.val,max);
    }
}