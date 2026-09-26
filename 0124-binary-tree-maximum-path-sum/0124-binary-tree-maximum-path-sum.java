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
    int DFS(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=DFS(root.left);
        int right=DFS(root.right);
        left=(left<0)?0:left;
        right=(right<0)?0:right;
        int x=root.val+left+right;
        ans=Math.max(ans,x);
        return root.val+Math.max(left,right);
    }
}