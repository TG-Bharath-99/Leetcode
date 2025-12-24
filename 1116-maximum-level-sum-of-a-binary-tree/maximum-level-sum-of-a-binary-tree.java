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
    public int maxLevelSum(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        Queue<TreeNode>q=new LinkedList<>();
        int level=1,maxlevel=1;
        int sum=Integer.MIN_VALUE;
        q.offer(root);
        while(!q.isEmpty()){
            int siz=q.size();
            int currsum=0;
            for(int i=0;i<siz;i++){
                TreeNode temp=q.poll();
                if(temp!=null){
                    currsum+=temp.val;
                }
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            if(currsum>sum){
                maxlevel=level;
                sum=currsum;
            }
            level++;
        }
        return maxlevel;
    }
}