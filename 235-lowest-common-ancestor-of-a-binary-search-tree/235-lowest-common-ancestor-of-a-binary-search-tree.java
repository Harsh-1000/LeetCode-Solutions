/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    
    private TreeNode helper(TreeNode root , int p ,int q)
    {
        if(root == null)
            return null;
        
        if(root.val==p || root.val==q)
            return root;
        
        TreeNode left = helper(root.left,p,q);
       TreeNode right =  helper(root.right,p,q);
        
        if(right==null ) return left;
        if(left==null ) return right;
        
        return root;
            
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return helper(root,p.val,q.val);
        
        
        
        
    }
}