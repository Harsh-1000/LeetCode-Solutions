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
    
    int res=0;
    int[] nums = new int[10];
    
    private void helper(TreeNode root)
    {
        if(root==null)
            return;
        
        nums[root.val]++;
        
        if(root.left==null && root.right==null)
        {
            int odd=0;
            for(int i=1;i<10;i++)
            {
                if(nums[i]%2!=0)
                     odd++; 
            }
            
           if(odd<=1)
               res++;
        }
        
        helper(root.left);
        helper(root.right);
        
        nums[root.val]--;
            
    }
    
    public int pseudoPalindromicPaths (TreeNode root) {
        
        helper(root);
        return res;
        
        
        
    }
}