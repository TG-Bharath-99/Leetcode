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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        DFS(root,ans);
        return ans;
    }
    void DFS(TreeNode root,List<Integer>ans){
        if(root==null) return;
        DFS(root.left,ans);
        DFS(root.right,ans);
        ans.add(root.val);
    }
}