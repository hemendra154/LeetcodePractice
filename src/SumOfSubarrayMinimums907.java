import java.util.Stack;

public class SumOfSubarrayMinimums907 {

    /*
    907. Sum of Subarray Minimums

    Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr.
    Since the answer may be large, return the answer modulo 109 + 7.



    Example 1:

    Input: arr = [3,1,2,4]
    Output: 17
    Explanation:
    Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].
    Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
    Sum is 17.

     */
    void print() {
        int[] nums = {1,3,3};
        System.out.println(sumSubarrayMins(nums));
    }



        /*
        Below for loop took O(n^2)
         */
//        for(int i = 0; i < arr.length;i++){
//            Stack<Integer> stack = new Stack<>();
//            for(int j = i; j < arr.length;j++){
//                if(stack.empty()){
//                    stack.push(arr[j]);
//                    sum = sum + arr[j];
//                }else{
//                    int min = stack.pop();
//                    min = Math.min(min, arr[j]);
//                    stack.push(min);
//                    sum = sum + min;
//                }
//            }
//        }

    //Optimized approch
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            long countLeft = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] <= arr[i])
                    break;
                countLeft++;
            }
            long countRight = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    break;
                countRight++;
            }
            sum = sum + countLeft * countRight * arr[i];
        }


        return (int) (sum % (Math.pow(10, 9) + 7));
    }


    // use monotonic approch then
    // leftcount = i - pse;
    // rightcouter = mse - i;
}
