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
    
    int sum=0;
    
    private int heightTree(TreeNode root)
    {
        if(root==null)
            return 0;
        
     return  Math.max(heightTree(root.left),heightTree(root.right)) + 1;
        
    }
    
    
    private void helper(TreeNode root, int h)
    {
        if(root==null)
            return;
        
        if(h==1)
            sum=sum+root.val;
        
         h=h-1;
         helper(root.left,h);
         helper(root.right,h);
        
    }
    
    public int deepestLeavesSum(TreeNode root) {
        
        int h = heightTree(root);
        
        System.out.println(h);
        
        helper(root,h);
        
        return sum;
        
        
        
    }
}