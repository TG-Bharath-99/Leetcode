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
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        helper(root,targetSum,0,new ArrayList<>());
        return ans;
    }
    public void helper(TreeNode root,int target,int sum,List<Integer>curr){
        if(root==null){
            return;
        }
        sum+=root.val;
        curr.add(root.val);
        if(root.left==null && root.right==null && sum==target){
            ans.add(new ArrayList<>(curr));
        }    
        helper(root.left,target,sum,curr);
        helper(root.right,target,sum,curr);
        curr.remove(curr.size()-1);
    }
}