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
    public List<Integer> rightSideView(TreeNode root){
        List<Integer>ans=new LinkedList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            for(int i=1;i<=level;i++){
                TreeNode temp=q.poll();
                if(i==level){
                    if(temp!=null) ans.add(temp.val);
                }
                if(temp!=null && temp.left!=null) q.offer(temp.left);
                if(temp!=null && temp.right!=null) q.offer(temp.right);
            }
        }
        return ans;
    }
}