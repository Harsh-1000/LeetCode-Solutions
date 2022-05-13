class Solution {
    public Node connect(Node root) {
        
        if(root == null)return root;
    
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i< size; i++){
                Node curr = queue.poll();
            
                if(i<size-1) curr.next = queue.peek();
                
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
        }
        return root;
    }
}