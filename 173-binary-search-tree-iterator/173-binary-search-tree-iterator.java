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
class BSTIterator {
    
    
    Queue<Integer> tree = new LinkedList<>();
    
    
    public BSTIterator(TreeNode root) {
        
        helper(root);
        
    }
    
    private void helper(TreeNode root)
    {
        if(root==null)
            return;
        
        helper(root.left);
        
        tree.offer(root.val);
        
        helper(root.right);
    }
    
    public int next() {
        
        return tree.poll();
        
    }
    
    public boolean hasNext() {
        
        return !(tree.isEmpty());
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */