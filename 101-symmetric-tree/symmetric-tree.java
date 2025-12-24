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
    public boolean isSymmetric(TreeNode root){
        if(root.left==null && root.right==null){
            return true;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while(!q.isEmpty()){
            TreeNode temp1=q.poll();
            TreeNode temp2=q.poll();
            if((temp1==null && temp2!=null) || (temp1!=null && temp2==null)){
                return false;
            }
            if(temp1!=null && temp2!=null && temp1.val!=temp2.val){
                return false;
            }
           
           if(temp1.left==null && temp2.right!=null){
               return false;
           }
           if(temp1.right==null && temp2.left!=null){
               return false;
           }
           
           if(temp1.right!=null) q.offer(temp1.right);
           if(temp2.left!=null) q.offer(temp2.left);
           if(temp1.left!=null) q.offer(temp1.left);
           if(temp2.right!=null) q.offer(temp2.right);
           
           
        }
        return true;
    }
}