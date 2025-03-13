public class MaxConsecutiveOnesIII1004 {

    void print(){
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }
    public int longestOnes(int[] nums, int k) {
            int left = 0, right = 0;
            int max = 0;
            while(right< nums.length){

                if(nums[right] == 1){
                    max = Math.max(max, right-left+1);
                    right++;
                }else if(k>0){
                    k--;
                    max = Math.max(max, right-left+1);
                    right++;
                }else{
                    while(nums[left] == 1){
                        left++;
                    }
                    left++;
                    k++;
                }
            }

            return max;
    }
}
