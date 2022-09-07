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
    
    StringBuilder str = new StringBuilder("");
    public void helper(TreeNode root)
    {
        if(root==null)
            return;
        
         str.append(root.val);
       
         if(root.left!=null || root.right!=null)
         {
              str.append("("); 
              helper(root.left);
              str.append(")");
         }
        
    
         if(root.right!=null)
         {
             str.append("(");
             helper(root.right);
             str.append(")");
         }
           
    }
    public String tree2str(TreeNode root) {
        
        helper(root);
        return new String(str);
        
    }
}