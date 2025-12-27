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
    int count=0;
    public int pathSum(TreeNode root, int targetSum){
        HashMap<Long,Integer>map=new HashMap<>();
        map.put(0L,1);
        helper(root,0L,targetSum,map);
        return count;
    }
    public void helper(TreeNode root,long sum,int target,HashMap<Long,Integer>map){
        if(root==null){
            return;
        }
        sum+=root.val;
        count+=map.getOrDefault(sum-target,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        helper(root.left,sum,target,map);
        helper(root.right,sum,target,map);
        map.put(sum,map.get(sum)-1);
    }
}