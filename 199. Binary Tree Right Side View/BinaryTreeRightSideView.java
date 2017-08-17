/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeRightSideView {
    int flag=0;
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        right(root, 1, flag);
        return list;
    }    
    
    public void right(TreeNode y, int level, int fla){
        if(y == null){
            return;
        }
        if(flag < level){
            list.add(y.val);
            flag = level;
        }
        
        right(y.right, level+1, flag);
        right(y.left, level+1, flag);
    }
    
    public List<Integer> rightSideViewWithQueue(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                
                if(i == size-1){
                    list.add(node.val);
                }
                
                if(node.left != null){
                    queue.add(node.left);
                }
                
                if(node.right != null){
                    queue.add(node.right);
                }
                
            }
        }
        return list;
    }
}
