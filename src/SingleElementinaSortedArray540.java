public class SingleElementinaSortedArray540 {
    /*
    You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.
     */
    void print() {
        int[] num = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(num));
    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];
         return binarySearch(nums, 0, nums.length-1);
    }
    int binarySearch(int[] nums, int beg, int end){
        if(beg>end)
            return -1;
        int mid = beg + (end-beg)/2;

        if(mid == 0 && nums[mid] != nums[mid+1]){
            return nums[mid];
        }else if(mid == 0 && nums[mid] == nums[mid+1]){
            return -1;
        }else if(mid == nums.length-1 && nums[mid] != nums[mid-1]){
            return nums[mid];
        }else if(mid == nums.length-1 && nums[mid] == nums[mid-1]){
            return -1;
        }else if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
            return nums[mid];
        }else{
            int result = binarySearch(nums, beg, mid-1);
            if(result == -1){
                result = binarySearch(nums, mid+1, end);
            }
            return result;
        }

    }
}
