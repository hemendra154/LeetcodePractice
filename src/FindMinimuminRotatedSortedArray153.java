public class FindMinimuminRotatedSortedArray153 {

    void print() {
        int[] num = {2,1};
        System.out.println(findMin(num));
    }

    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length-1);
    }

    int binarySearch(int[] nums, int beg, int end){

        int mid = beg + (end-beg)/2;

        if(beg >= end){
            return nums[beg];
        }

        if(nums[beg]<=nums[mid] && nums[mid]<=nums[end]){
            return nums[beg];
        }

        if(nums[beg]>=nums[mid]){
            return binarySearch(nums, beg, mid-1);
        }else {
            return binarySearch(nums, mid + 1, end);
        }
    }

}
