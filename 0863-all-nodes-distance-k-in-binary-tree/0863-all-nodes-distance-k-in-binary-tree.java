/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution{
    List<Integer>ans=new ArrayList<>();
    Map<TreeNode,TreeNode>map=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k){
        inorder(root,null);
        Queue<TreeNode>q=new LinkedList<>();
        Set<TreeNode>visited=new HashSet<>();
        TreeNode temp=target;
        q.offer(temp);
        visited.add(temp);
        int level=0;
        while(!q.isEmpty()){
            if(level==k) break;
            int size=q.size();
            while(size>0){
                TreeNode curr=q.poll();
                visited.add(curr);
                if(curr!=null && curr.left!=null && !visited.contains(curr.left)){
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr!=null && curr.right!=null && !visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                if(curr!=null && map.get(curr)!=null && !visited.contains(map.get(curr))){
                    q.offer(map.get(curr));
                    visited.add(map.get(curr));
                }
                size--;
            }
            level++;
        }
        for(TreeNode x: q){
            ans.add(x.val);
        }
        return ans;
    }
    public void inorder(TreeNode root,TreeNode par){
        if(root==null) return;
        map.put(root,par);
        inorder(root.left,root);
        inorder(root.right,root);
    }
}