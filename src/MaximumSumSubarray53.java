public class MaximumSumSubarray53 {
    void print(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {

        int resultSum = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length;i++) {
            int sum = 0;
            for(int j = i;j<nums.length;j++) {
                sum = sum + nums[j];
                if(sum>resultSum)
                    resultSum = sum;
                if(sum<0)
                    sum = 0;
            }
        }

        return resultSum;
    }
}

