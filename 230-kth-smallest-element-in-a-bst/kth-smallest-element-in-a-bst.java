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
    int L=0;
    public int kthSmallest(TreeNode root, int k){
        L=k;
        DFS(root);
        return ans;
    }
    void DFS(TreeNode root){
        if(root==null){
            return;
        }
        DFS(root.left);
        L--;
        if(L==0){
            ans=root.val;
            return;
        }
        DFS(root.right);
    }
}