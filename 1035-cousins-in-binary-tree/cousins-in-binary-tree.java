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
    public boolean isCousins(TreeNode root, int x, int y){
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);
        int xLevel=level(root,x,0);
        int yLevel=level(root,y,0);
        if(xLevel==yLevel && xx!=yy){
            return true;
        }
        return false;
    }
    int level(TreeNode root,int x,int l){
        if(root==null){
            return 0;
        }
        if(root.val==x){
            return l;
        }
        int lev=level(root.left,x,l+1);
        if(lev!=0){
            return lev;
        }
        return level(root.right,x,l+1);
    }
    TreeNode findNode(TreeNode root,int x){
        if(root==null){
            return null;
        }
        if((root.left!=null && root.left.val==x) || (root.right!=null && root.right.val==x)){
            return root;
        }
        TreeNode node=findNode(root.left,x);
        if(node!=null){
            return node;
        }
        return findNode(root.right,x);
    }
}