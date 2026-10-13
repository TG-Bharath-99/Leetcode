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
    public int minCameraCover(TreeNode root){
        if(DFS(root)==0) ans++;
        return ans;
    }
    int DFS(TreeNode root){
        if(root==null) return 2;
        int left=DFS(root.left);
        int right=DFS(root.right);
        if(left==0 || right==0){
            ans++;
            return 1;
        }
        if(left==1 || right==1){
            return 2;
        }
        return 0;
    }
}