public class MaximumProductSubarray152 {

    void print() {
        int[] num = {-2};
        System.out.println(maxProduct(num));
    }

    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;

        int prod = 1;
        for (int j = 0; j < nums.length; j++) {
            prod = prod * nums[j];
            result = Math.max(result, prod);
            if (prod == 0) prod = 1;
        }
        int prod1 = 1;
        for (int j = nums.length-1; j >=0 ; j--) {
            prod1 = prod1 * nums[j];
            result = Math.max(result, prod1);
            if (prod1 == 0) prod1 = 1;
        }

        return result;
    }
}
