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
    int ans=0;
    public int sumOfLeftLeaves(TreeNode root){
        DFS(root,0);
        return ans;
    }
    void DFS(TreeNode root,int h){
        if(root==null) return;
        if(root.left==null && root.right==null && h==2) ans+=root.val;
        DFS(root.left,2);
        DFS(root.right,1);
    }
}