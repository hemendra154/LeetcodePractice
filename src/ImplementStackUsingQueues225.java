import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues225 {

    void print(){
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(9);
        obj.push(6);
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}

class MyStack {

    Queue<Integer> queue1;


    public MyStack() {
        queue1 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        Queue<Integer> queue2 = new LinkedList<>();
        int topElement = 0;
        while(queue1.peek() != null) {
            topElement = queue1.poll();
            if (queue1.peek() != null) {
                queue2.add(topElement);
            }
        }
        queue1 = new LinkedList<>(queue2);
        return topElement;
    }

    public int top() {
        Queue<Integer> queue2 = new LinkedList<>();
        int topElement = 0;
        while(queue1.peek() != null) {
            topElement = queue1.poll();
            queue2.add(topElement);
        }
        queue1 = new LinkedList<>(queue2);
        return topElement;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
