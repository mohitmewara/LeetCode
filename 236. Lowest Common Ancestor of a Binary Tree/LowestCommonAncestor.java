/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LowestCommonAncestor {
    
    boolean a=false,b=false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        TreeNode ancestor = lca(root, p, q);
        if(a && b){
            return ancestor;
        }
        return null;
    }
    
    public TreeNode lca(TreeNode y, TreeNode p, TreeNode q){
        if(y == null){
            return null;
        }
        TreeNode leftTree;
        TreeNode rightTree;
        
        if(y == p){
            a=true;
            leftTree = lca(y.left, p, q);
            rightTree = lca(y.right, p, q);
            return y;
        }
        
        if(y ==q){
            b=true;
            leftTree = lca(y.left, p, q);
            rightTree = lca(y.right, p, q);
            return y;
        }
        
        leftTree = lca(y.left, p, q);
        rightTree = lca(y.right, p, q);
        
        if(leftTree != null && rightTree != null){
            return y;
        }
        
        return (leftTree == null ? rightTree:leftTree);
        
    }
    
}
