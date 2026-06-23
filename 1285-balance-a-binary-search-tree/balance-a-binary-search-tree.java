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
    List<Integer>list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root){
        inorder(root);
        return build(0,list.size()-1);
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode build(int low,int high){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=build(low,mid-1);
        root.right=build(mid+1,high);
        return root;
    }
}