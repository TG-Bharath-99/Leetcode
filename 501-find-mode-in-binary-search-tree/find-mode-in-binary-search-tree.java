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
    int count=0;
    int maxCount=0;
    Integer prev=null;
    public int[] findMode(TreeNode root){
        inorder(root);
        int []ans=new int[list.size()];
        int index=0;
        for(Integer x : list) ans[index++]=x;
        return ans;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev==null || prev!=root.val) count=1;
        else count++;
        if(count>maxCount){
            maxCount=count;
            list.clear();
            list.add(root.val);
        }
        else if(count==maxCount) list.add(root.val);
        prev=root.val;
        inorder(root.right);
    }
}