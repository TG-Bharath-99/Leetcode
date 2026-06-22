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
    List<Integer>ans1=new ArrayList<>();
    List<Integer>ans2=new ArrayList<>();
    public List<Integer>getAllElements(TreeNode root1, TreeNode root2){
        DFS1(root1);
        DFS2(root2);
        List<Integer>ans=new ArrayList<>();
        int i=0,j=0;
        while(i<ans1.size() && j<ans2.size()){
            if(ans1.get(i)<ans2.get(j)) ans.add(ans1.get(i++));
            else ans.add(ans2.get(j++));
        }
        while(i<ans1.size()) ans.add(ans1.get(i++));
        while(j<ans2.size()) ans.add(ans2.get(j++));
        return ans;
    }
    public void DFS1(TreeNode root){
        if(root==null) return;
        DFS1(root.left);
        ans1.add(root.val);
        DFS1(root.right);
    }
    public void DFS2(TreeNode root){
        if(root==null) return;
        DFS2(root.left);
        ans2.add(root.val);
        DFS2(root.right);
    }
}