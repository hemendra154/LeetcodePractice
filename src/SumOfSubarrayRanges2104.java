import java.util.Stack;

public class SumOfSubarrayRanges2104 {

    void print() {
        int[] nums = {1,3,3};
        System.out.println(subArrayRanges(nums));
    }

    public long subArrayRanges(int[] nums) {
        long sumOfSubArrayMinimum = sumSubarrayMins(nums);
        long sumOfSubArrayMaximum = sumSubarrayMax(nums);

        return sumOfSubArrayMaximum - sumOfSubArrayMinimum;
    }
    public long sumSubarrayMins(int[] arr) {
        long result = 0;
        int[] ps = previousSmallest(arr);
        int[] ns = nextSmallest(arr);

        for(int i = 0; i< arr.length;i++){
            result = result + ((long) (i - ps[i]) * (ns[i]-i) * arr[i]);
        }
        return  result;
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
            while(!stack.empty() && heights[stack.peek()] > heights[i]){
                stack.pop();
            }
            ns[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        return ns;
    }
    public long sumSubarrayMax(int[] arr) {
        long result = 0;
        int[] pg = previousGreatest(arr);
        int[] ng = nextGreatest(arr);

        for(int i = 0; i< arr.length;i++){
            result = result + ((long) (i - pg[i]) * (ng[i]-i) * arr[i]);
        }
        return  result;
    }



    public int[] previousGreatest(int[] heights) {
        int[] pg = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<heights.length; i++){
            while(!stack.empty() && heights[stack.peek()] <= heights[i]){
                stack.pop();
            }
            pg[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pg;
    }

    public int[] nextGreatest(int[] heights) {
        int[] ng = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = heights.length-1; i>-1; i--){
            while(!stack.empty() && heights[stack.peek()] < heights[i]){
                stack.pop();
            }
            ng[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }
        return ng;
    }

}
