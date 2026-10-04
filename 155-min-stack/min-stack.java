class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        stack.push(value);
        if(stack2.isEmpty() || value<=stack2.peek()){
            stack2.push(value);
        }
        else{
            stack2.push(stack2.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */