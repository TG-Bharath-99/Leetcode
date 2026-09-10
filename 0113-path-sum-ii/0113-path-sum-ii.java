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
        DFS(root,targetSum,new ArrayList<>());
        return ans;
    }
    void DFS(TreeNode root,int target,List<Integer>list){
        if(root==null){
            return;
        }
        if(root.val==target && root.left==null && root.right==null){
            list.add(root.val);
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(root.val);
        DFS(root.left,target-root.val,list);
        DFS(root.right,target-root.val,list);
        list.remove(list.size()-1);
    }
}