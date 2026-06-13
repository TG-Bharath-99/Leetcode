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
    public TreeNode sortedArrayToBST(int[] nums){
        return BST(nums,0,nums.length-1);
    }
    TreeNode BST(int []nums,int l,int h){
        if(l>h){
            return null;
        }
        int mid=l+(h-l)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=BST(nums,l,mid-1);
        root.right=BST(nums,mid+1,h);
        return root;
    }
}