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
class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();
    
    private void helper(TreeNode root)
    {
        if(root==null)
            return;
        
        helper(root.left);
        
        helper(root.right);
        
        list.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        helper(root);
        
        return list;
        
        
    }
}