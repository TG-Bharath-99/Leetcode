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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        DFS(root);
        return ans;
    }
    public int DFS(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=DFS(root.left);
        int right=DFS(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        ans=Math.max(ans,left+root.val+right);
        return root.val+Math.max(left,right);
    }
}