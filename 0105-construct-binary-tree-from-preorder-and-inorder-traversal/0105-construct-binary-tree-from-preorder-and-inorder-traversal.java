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
    Map<Integer,Integer>map;
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return fun(preorder,0,inorder.length-1);
    }
    TreeNode fun(int []preorder,int start,int end){
        if(start>end){
            return null;
        }
        int val=preorder[index++];
        TreeNode root=new TreeNode(val);
        root.left=fun(preorder,start,map.get(val)-1);
        root.right=fun(preorder,map.get(val)+1,end);
        return root;
    }
}