public class MinimumSizeSubarraySum209 {
    void print(){
        minSubArrayLen(4,new int[]{1,4,4});
    }

    public int minSubArrayLen(int target, int[] nums) {
        int wstart = 0, wend = 0;
        int size = nums.length;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(wstart < size && wend<size){
            sum = sum + nums[wend];
            if(sum == target){
                result = Math.min(result, wend-wstart+1);
                wend++;
            }
            else if(sum < target){
                wend++;
            }
            else {
                sum = sum-nums[wstart];
                wstart++;
                if(sum == target){
                    result = Math.min(result, wend-wstart+1);
                    wend++;
                }
            }
        }

        return result;
    }
}
