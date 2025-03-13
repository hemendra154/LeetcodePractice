import java.util.Stack;

public class ImplementQueueUsingStacks232 {
    void print(){
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(9);
        obj.push(6);
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }

}

class MyQueue {

    Stack<Integer> stack1;

    public MyQueue() {
        stack1 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        Stack<Integer> stack2 = new Stack<>();
        Integer top = 0;

        while(!stack1.empty()){
            top = stack1.pop();
            if(!stack1.isEmpty())
                stack2.push(top);
        }
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }

        return top;
    }

    public int peek() {
        Stack<Integer> stack2 = new Stack<>();
        Integer top = 0;

        while(!stack1.empty()){
            top = stack1.pop();
            stack2.push(top);
        }
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }

        return top;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
