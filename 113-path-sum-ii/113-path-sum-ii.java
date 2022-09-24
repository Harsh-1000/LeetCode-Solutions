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
    
    List<List<Integer>> l1 = new ArrayList<>();
    
    private void helper(TreeNode root, int targetSum, Stack st)
    {
        if(root==null)
            return;
        
        targetSum -= root.val;
        st.push(root.val);
        
        if(targetSum==0 && root.left==null &&  root.right==null)
            l1.add(new ArrayList<>(st));
            
        helper(root.left,targetSum,st);
        helper(root.right,targetSum,st);
         
        
        st.pop();
    }
    
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        
        Stack<Integer> st = new Stack();
        
        helper(root,targetSum,st);
        
        return l1;
        
                
    }
}