import java.util.Stack;

public class LargestRectangleInHistogram84 {

    void print() {
        int[] heights = {1,1};
        System.out.println(largestRectangleArea(heights));
    }

    public int largestRectangleArea(int[] heights) {

        // find previous smallest and next smallest for each element and then find the area using below formular
        // area = height * (NS-PS-1)

        int area = 0;
        int[] ps = previousSmallest(heights);
        int[] ns = nextSmallest(heights);

        for(int i = 0; i< heights.length;i++){
            area = Math.max(area, heights[i] * (ns[i] - ps[i] -1));
        }


        return area;
    }

    public int[] previousSmallest(int[] heights) {
        int[] ps = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<heights.length; i++){
            while(!stack.empty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            ps[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ps;
    }

    public int[] nextSmallest(int[] heights) {
        int[] ns = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = heights.length-1; i>-1; i--){
            while(!stack.empty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            ns[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        return ns;
    }
}
