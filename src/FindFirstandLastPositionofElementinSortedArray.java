public class FindFirstandLastPositionofElementinSortedArray {
    void print() {
        int[] num = {5,7,7,8,8,10};
        System.out.println(searchRange(num, 8));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length == 0) {
            return result;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid = (end - start) / 2;

        while (start < end) {
            if (nums[mid] == target) {
                break;
            }

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        if (nums[mid] == target) {
            int first = mid, last = mid;
            for (int i = first; i >= 0; i--) {
                if (i - 1 > -1 && nums[i - 1] != target) {
                    first = i;
                    break;
                } else {
                    first = i;
                }
            }

            for (int i = last; i < nums.length; i++) {
                if (i + 1 <= nums.length-1 && nums[i + 1] != target) {
                    last = i;
                    break;
                } else {
                    last = i;
                }
            }
            result[0] = first;
            result[1] = last;

            return result;
        }

        return result;
    }
}
