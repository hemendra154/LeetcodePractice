import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    void print() {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        threeSum(nums,-294967296);
        int a = 1;
    }

    public List<List<Integer>> threeSum(int[] nums, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            if(i>0 && nums[i]==nums[i-1]){
//                continue;
//            }
//            int start = i+1;
//            int end = nums.length-1;
//            while(start<end){
//                if(nums[i] + nums[start] + nums[end] == 0){
//                    result.add(Arrays.asList(nums[i],nums[start], nums[end]));
//
//                    while(start<end && nums[start]==nums[start+1]){
//                        start++;
//                    }
//                    while(start<end && nums[end]==nums[end-1]){
//                        end--;
//                    }
//                    start++;
//                    end--;
//                }else if(nums[i] + nums[start] + nums[end] < 0){
//                    start++;
//                }else{
//                    end--;
//                }
//            }
//        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length-3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (int i = a + 1; i < nums.length-2; i++) {
                if (i > 1 && i-1 != a && nums[i] == nums[i - 1]) {
                    continue;
                }
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    long sum = (long) nums[a] + nums[i] + nums[start] + nums[end];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[a], nums[i], nums[start], nums[end]));

                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        start++;
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }


        return result;
    }

}
