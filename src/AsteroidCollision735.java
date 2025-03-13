import java.util.Arrays;
import java.util.Stack;

/*
We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 */
public class AsteroidCollision735 {

    void print(){
        int[] arr = {10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public int[] asteroidCollision(int[] asteroids) {

        int size = asteroids.length;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < size ;i++){
            if(stack.empty()
                    || (stack.peek() < 0 && asteroids[i] < 0)
                    || (stack.peek() > 0 && asteroids[i] > 0)) {
                stack.push(asteroids[i]);
            }else {
                int current = Math.abs(asteroids[i]);
                boolean pushRequired = true;
                while(!stack.empty()
                        && (stack.peek() > 0 && asteroids[i] < 0)){
                    int fromStack = Math.abs(stack.peek());
                    if(fromStack == current) {
                        stack.pop();
                        pushRequired = false;
                        break;
                    }else if(fromStack > current){
                        stack.pop();
                    }else{
                        pushRequired = false;
                        break;
                    }
                }
                if(pushRequired){
                    stack.push(asteroids[i]);
                }
            }
        }
        int[] result = new int[stack.size()];
        int i = 0;
        while(!stack.empty()){
            result[i++] = stack.pop();
        }

        return result;
    }

    //GPT
    public int[] asteroidCollision1(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (Math.abs(asteroid) > top) {
                    stack.pop(); // Current asteroid destroys the top of the stack
                } else if (Math.abs(asteroid) == top) {
                    stack.pop(); // Both asteroids destroy each other
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // Current asteroid is destroyed
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid); // Push the current asteroid if it survives
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
