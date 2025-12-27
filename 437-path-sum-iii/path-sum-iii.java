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
    public int pathSum(TreeNode root, int targetSum){
        List<Integer>path=new LinkedList<>();
        return helper(root,targetSum,path);
    }
    public int helper(TreeNode root,int sum,List<Integer>path){
        if(root==null){
            return 0;
        }
        path.add(root.val);
        ListIterator<Integer>it=path.listIterator(path.size());
        int count=0;
        long s=0;
        while(it.hasPrevious()){
            s+=it.previous();
            if(s==sum){
                count++;
            }
        }
        count+=helper(root.left,sum,path)+helper(root.right,sum,path);
        path.remove(path.size()-1);
        return count;
    }
}