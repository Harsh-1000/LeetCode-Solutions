class MyQueue {
    
    Stack<Integer> st;
    Stack<Integer> dummy;

    public MyQueue() {
        
        st = new Stack<>();
        dummy = new Stack<>();
        
    }
    
    public void push(int x) {
        
        if(st.isEmpty())
            st.push(x);
        
        else
        {
        
            
            while(!st.isEmpty())
            {
                dummy.push(st.pop());
            }
            
            st.push(x);
            
        
            
            while(!dummy.isEmpty())
            {
                st.push(dummy.pop());
            }
        }
        
    }
    
    public int pop() {
        
       return st.pop();
        
    }
    
    public int peek() {
        
        return st.peek();
        
        
    }
    
    public boolean empty() {
        
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */