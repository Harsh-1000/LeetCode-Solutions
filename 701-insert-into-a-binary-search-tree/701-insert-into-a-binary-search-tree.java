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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        
        if(root==null)
        {
            TreeNode res = new TreeNode(val);
            return res;
        }
        
        if(val<=root.val)
        {
            if(root.left==null)
            {
                 TreeNode res = new TreeNode(val);
                 root.left=res;
            }
            
            else
            insertIntoBST(root.left,val);
                
        }
        
        
        if(val>root.val)
        {
            if(root.right==null)
            {
                 TreeNode res = new TreeNode(val);
                 root.right=res;
                
            }
            
            else
            insertIntoBST(root.right,val);
                
        }
        
        return root;
        
    }
}