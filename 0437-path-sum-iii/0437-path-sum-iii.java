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
    Map<Long,Integer>map=new HashMap<>();
    int ans=0;
    public int pathSum(TreeNode root, int targetSum){
        map.put(0L,1);
        DFS(root,targetSum,0L);
        return ans;
    }
    void DFS(TreeNode root,int target,long sum){
        if(root==null){
            return;
        }
        sum+=root.val;
        long k=sum-target;
        ans+=map.getOrDefault(k,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        DFS(root.left,target,sum);
        DFS(root.right,target,sum);
        map.put(sum,map.get(sum)-1);
    }
}