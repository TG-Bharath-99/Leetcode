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
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        String s1=serialize(root);
        String s2=serialize(subRoot);
        System.out.print(s1+"\n"+s2);
        return s1.contains(s2);
    }
    String serialize(TreeNode root){
        if(root==null){
            return "*";
        }
        return ","+root.val+serialize(root.left)+serialize(root.right);
    }
}