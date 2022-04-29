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
   
    List<List<Integer>> list = new ArrayList<>();
     
   
    
     Queue<TreeNode>  q = new LinkedList<>();
  
    
    private void helper(TreeNode root)
    {
         
       
        q.add(root);
        q.add(null);
        List<Integer> l = new ArrayList<>();
        
        while(!q.isEmpty())
        {
             
        
          TreeNode cur = q.poll();            
           
            if(cur==null)
            {
                if(q.isEmpty())
                {
                    if(!l.isEmpty())
                        list.add(l);
                    return;      
                }    
                
                q.add(null);
                list.add(l);
                l = new ArrayList<>();
                
                continue;
            
            }
         
            l.add(cur.val); 
            
            if(cur.left!=null)
                q.add(cur.left);
            
              if(cur.right!=null)
                q.add(cur.right); 
          
        }    
    }
    
    
    public List<List<Integer>> levelOrder(TreeNode root) {
                  
        if(root!=null)
            helper(root);
        
        return list;
    
        
    }
}