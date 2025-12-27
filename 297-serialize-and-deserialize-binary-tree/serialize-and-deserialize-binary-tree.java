/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec{
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root){
        return helper1(root);
    }
    String helper1(TreeNode root){
        if(root==null){
            return "n,";
        }
        String l=helper1(root.left);
        String r=helper1(root.right);
        return String.valueOf(root.val)+","+l+r;
    }
    int i=0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data){
        String []arr=data.split(",");
        return helper2(arr);
    }
    TreeNode helper2(String []arr){
        if(arr[i].equals("n")){
            i++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(arr[i++]));
        node.left=helper2(arr);
        node.right=helper2(arr);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));