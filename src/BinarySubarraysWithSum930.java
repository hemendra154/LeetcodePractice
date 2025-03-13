import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum930 {

    //Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
    //
    //A subarray is a contiguous part of the array.

    void print(){
        int[] num = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(num, 2));
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        for(int i=1; i< nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            count = count + map.getOrDefault(nums[i]-goal, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }
}
