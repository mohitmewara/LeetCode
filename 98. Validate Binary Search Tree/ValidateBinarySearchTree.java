/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ValidateBinarySearchTree {
    TreeNode prev=null;
    public boolean isValidBST(TreeNode y){
        if(y == null){
            return true;
        }
        if(!isValidBST(y.left)){
            return false;
        }
        if(prev !=null && y.val <= prev.val){
            return false;
        }
        prev = y;
        return isValidBST(y.right); 
    }    
    
}
