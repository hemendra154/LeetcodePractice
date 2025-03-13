public class SearchinRotatedSortedArray33 {
    void print() {
        int[] num = {4};
        System.out.println(search(num, 0));
    }

    public int search(int[] nums, int target) {
        int size = nums.length;

        if(size == 0)
            return -1;

        int start = 0;
        int end = size-1;


        return binarySearch(nums, start, end, target);
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        if(start>end)
            return -1;

        int mid = start + (end-start)/2;
        if (nums[mid] == target)
            return mid;

        if (nums[mid] >= nums[start]) {
            if (nums[start] <= target && target <= nums[mid]) {
                return binarySearch(nums, start, mid - 1, target);
            } else {
                return binarySearch(nums, mid + 1, end, target);
            }
        } else {
            if (nums[mid] <= target && target <= nums[end]) {
                return binarySearch(nums, mid+1, end, target);
            } else {
                return binarySearch(nums, start, mid-1, target);
            }
        }
    }
}
