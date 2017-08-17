/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return true;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int siz = queue.size();
            int[] arr = new int[2*siz];
            int counter =0;
            for(int i =0;i<siz;i++){
                TreeNode node = queue.poll();
                
                if(node.left != null){
                    arr[counter] = node.left.val;
                    counter++;  
                    queue.add(node.left);
                }else{
                    arr[counter] = 0;
                    counter++;                    
                }
                
                if(node.right != null){
                    arr[counter] = node.right.val;
                    counter++;    
                    queue.add(node.right);
                }else{
                    arr[counter] = 0;
                    counter++;                    
                }
            }
            
            for(int i=0;i<arr.length/2;i++){
                if(arr[i] != arr[arr.length-1-i]){
                    return false;
                }
            }
            
        }
        
        return true;
    }
    

    
}
