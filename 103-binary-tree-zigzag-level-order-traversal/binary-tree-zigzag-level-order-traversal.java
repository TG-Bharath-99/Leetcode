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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        int x=0;
        Deque<TreeNode>dq=new LinkedList<>();
        dq.offerFirst(root);
        while(!dq.isEmpty()){
            List<Integer>list=new ArrayList<>();
            int size=dq.size();
            if(x%2==0){
                for(int i=0;i<size;i++){
                    TreeNode temp=dq.pollFirst();
                    list.add(temp.val);
                    if(temp.left!=null) dq.offerLast(temp.left);
                    if(temp.right!=null) dq.offerLast(temp.right);
                }
            }
            else{
                for(int i=0;i<size;i++){
                    TreeNode temp=dq.pollLast();
                    list.add(temp.val);
                    if(temp.right!=null) dq.offerFirst(temp.right);
                    if(temp.left!=null) dq.offerFirst(temp.left);
                }
            }
            ans.add(list);
            x++;
        }
        return ans;
    }
}