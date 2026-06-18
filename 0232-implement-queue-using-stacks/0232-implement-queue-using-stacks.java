class MyQueue {
    //Approach 1 ] O(N) => push operation 
    Stack<Integer> st1,st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.empty()){
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        if(st1.empty()){
            return -1;
        }
        int topElement = st1.pop();
        return  topElement;
    }
    
    public int peek() {
        if(st1.empty()){
            return -1;
        }
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
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