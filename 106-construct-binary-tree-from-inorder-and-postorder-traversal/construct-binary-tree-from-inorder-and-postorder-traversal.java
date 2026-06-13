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
    Map<Integer,Integer>map=new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] inorder, int[] postorder){
        index=postorder.length-1;
        for(int i=0;i<=index;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,inorder,0,postorder.length-1);
    }
    TreeNode helper(int[] postorder, int[] inorder,int s,int e){
        if(s>e){
            return null;
        }
        int x=postorder[index--];
        TreeNode root=new TreeNode(x);
        root.right=helper(postorder,inorder,map.get(x)+1,e);
        root.left=helper(postorder,inorder,s,map.get(x)-1);
        return root;
    }
}