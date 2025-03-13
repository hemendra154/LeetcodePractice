public class LongestSubArrayWithSumK {

    void print(){
        int[] nums = {1, -1, 5, -2, 3};
        int sum = 3;
        System.out.print(longestSubArrayWithSumK(nums,sum));
    }

    int longestSubArrayWithSumK(int[] nums, int sum){

        int result = 0;

        for(int i = 0;i<nums.length;i++){
            int sumTemp = 0;
            int end = i;
            while(end< nums.length){
                sumTemp = sumTemp + nums[end];
                if(sumTemp == sum)
                    break;
                end++;
            }
            if(sumTemp == sum){
                int length = end-i +1;
                result = Math.max(result,length);
            }
        }
        return result;

    }
}
