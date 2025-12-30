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
    int index=0;
    public TreeNode buildTree(int[] inorder, int[] postorder){
        if(inorder.length==0 && postorder.length==0){
            return null;
        }
        index=postorder.length-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(inorder,postorder,0,inorder.length-1,map);
    }
    TreeNode helper(int[] inorder, int[] postorder,int left,int right,HashMap<Integer,Integer>map){
        if(left>right){
            return null;
        }
        int current=postorder[index];
        index--;
        TreeNode node=new TreeNode(current);
        if(left==right){
            return node;
        }
        int currentIndex=map.get(current);
        node.right=helper(inorder,postorder,currentIndex+1,right,map);
        node.left=helper(inorder,postorder,left,currentIndex-1,map);
        
        return node;
    }
}