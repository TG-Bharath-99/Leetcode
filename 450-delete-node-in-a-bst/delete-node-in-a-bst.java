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
    TreeNode findMax(TreeNode root){
        if(root.right==null){
            return root;
        }
        return findMax(root.right);
    }
    public TreeNode deleteNode(TreeNode root, int key){
        if(root==null){
            return root;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            TreeNode max=findMax(root.left);
            root.val=max.val;
            root.left=deleteNode(root.left,max.val);
        }
        return root;
    }
}