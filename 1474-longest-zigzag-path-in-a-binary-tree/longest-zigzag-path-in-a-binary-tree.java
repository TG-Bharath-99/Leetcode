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
    public int longestZigZag(TreeNode root){
        helper(root,0,0);
        helper(root,1,0);
        return ans;
    }
    void helper(TreeNode root,int dir,int level){
        if(root==null){
            return;
        }
        ans=Math.max(ans,level);
        if(dir==0){
            helper(root.right,1,level+1);
            helper(root.left,0,1);
        }
        else{
            helper(root.left,0,level+1);
            helper(root.right,1,1);
        }
    }
}