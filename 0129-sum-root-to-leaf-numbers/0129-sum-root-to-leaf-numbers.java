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
    public int sumNumbers(TreeNode root){
        DFS(root,0);
        return ans;
    }
    void DFS(TreeNode root,int sum){
        if(root==null){
            return;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            ans+=sum;
            sum-=root.val;
            return;
        }
        DFS(root.left,sum);
        DFS(root.right,sum);
        sum/=10;
    }
}