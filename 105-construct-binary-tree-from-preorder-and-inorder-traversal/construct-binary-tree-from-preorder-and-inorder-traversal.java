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
    int index;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1);
    }
    TreeNode helper(int[] preorder, int[] inorder,int s,int e){
        if(s>e){
            return null;
        }
        int x=preorder[index++];
        TreeNode root=new TreeNode(x);
        root.left=helper(preorder,inorder,s,map.get(x)-1);
        root.right=helper(preorder,inorder,map.get(x)+1,e);
        return root;
    }
}