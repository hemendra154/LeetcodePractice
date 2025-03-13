public class CheckifArrayIsSortedandRotated1752 {

    //Given an array nums, return true if the array was originally sorted in non-decreasing order,
    // then rotated some number of positions (including zero). Otherwise, return false.

    void print(){
        int[] nums = {2,1,3,4};
        System.out.println(check(nums));
    }
    public boolean check(int[] nums) {
        int breakPoint = 0;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i+1]-nums[i]<0){
               breakPoint++;
            }
        }
        if(breakPoint == 1 && nums[nums.length-1]>nums[0]){
            breakPoint++;
        }
        return breakPoint<=1;
    }
}
