import java.util.Stack;

public class MinStack155 {
    /*
    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.
     */
    void print(){
        MinStack m = new MinStack();
        m.push(-1);
        int x = m.top();
        int min = m.getMin();
    }
}

class Node{
    int value;
    int min  = Integer.MAX_VALUE;

    Node(){

    }

    Node(int value, int min){
        this.value = value;
        this.min = min;
    }
}

class MinStack {
    static int min = Integer.MAX_VALUE;

    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        min = Math.min(val, min);
        Node node = new Node(val,min);
        stack.push(node);
    }

    public void pop() {
        stack.pop();
        min = stack.peek() == null ? Integer.MAX_VALUE: stack.peek().min;
    }

    public int top() {
        return  stack.peek().value;
    }

    public int getMin() {
        return  stack.peek().min;
    }
}
