/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null){
            return "[]";
        }
        sb.append("[,");
        build(root, sb);
        sb.append("]");
        return sb.toString();
    }
    
    public void build(TreeNode root, StringBuilder sb) {
        if(root == null){
            sb.append("null,"); 
            return;
        }
        
        sb.append(root.val + ","); 
        build(root.left, sb);
        build(root.right, sb);
        
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
//        System.out.println(data);
        if(data == "[]"){
            return null;
        }
        
        String[] arr = data.split(",");
        
        TreeNode root = null;
        root = breakt(root, arr);
        return root;
    }
    int counter =0;
    public TreeNode breakt(TreeNode root, String[] arr) {
        counter++;
        if(arr[counter].equals("null") || arr[counter].equals("]")){
            return null;
        }
//        System.out.println(arr[counter]);
        root = new TreeNode(Integer.parseInt(arr[counter]));
        root.left = breakt(root.left, arr);
        root.right = breakt(root.right, arr);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
