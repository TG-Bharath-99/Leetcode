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
    public TreeNode buildTree(int[] inorder, int[] postorder){
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        index=inorder.length-1;
        return fun(postorder,0,inorder.length-1);
    }
    TreeNode fun(int []postorder,int start,int end){
        if(start>end){
            return null;
        }
        int val=postorder[index--];
        TreeNode root=new TreeNode(val);
        root.right=fun(postorder,map.get(val)+1,end);
        root.left=fun(postorder,start,map.get(val)-1);
        return root;
    }
}