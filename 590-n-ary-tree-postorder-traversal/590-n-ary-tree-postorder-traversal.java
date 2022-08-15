/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    private static void display(Node root,List l)
    {
        if(root==null)
            return;
        
   
        
        for(Node x: root.children)
            display(x,l);
        
        l.add(root.val);
        
    }
    
    public List<Integer> postorder(Node root) {
        
        List<Integer> l = new ArrayList<>();
        
        display(root,l);
        
        return l;
        
        
        
    }
}