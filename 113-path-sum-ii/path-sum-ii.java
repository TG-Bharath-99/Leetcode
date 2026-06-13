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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        DFS(root,targetSum,new ArrayList<>(),ans);
        return ans;
    }
    public static void DFS(TreeNode root,int targetSum,List<Integer>list,List<List<Integer>>ans){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(targetSum==root.val && root.left==null && root.right==null){
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        DFS(root.left,targetSum-root.val,list,ans);
        DFS(root.right,targetSum-root.val,list,ans);
        list.remove(list.size()-1);
    }
}