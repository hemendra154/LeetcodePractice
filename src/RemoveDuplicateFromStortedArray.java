import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromStortedArray {
    void print() {
    removeDuplicates(new int[]{1,1,1,2,2,3});
    }

    public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i]) < 2) {
                    map.put(nums[i], map.get(nums[i])+1);
                    nums[++j] = nums[i];
                }
            } else {
                map.put(nums[i], 1);
                nums[++j] = nums[i];
            }
        }

        return j;
    }
}
