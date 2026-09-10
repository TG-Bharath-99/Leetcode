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
    public int averageOfSubtree(TreeNode root){
        DFS(root);
        return ans;
    }
    int[] DFS(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        if(root.left==null && root.right==null){
            ans++;
            return new int[]{root.val,1};
        }
        int []left=DFS(root.left);
        int []right=DFS(root.right);
        int sum=root.val+left[0]+right[0];
        if(root.val==(sum/(1+left[1]+right[1]))){
            ans++;
        }
        return new int[]{sum,left[1]+right[1]+1};
    }
}