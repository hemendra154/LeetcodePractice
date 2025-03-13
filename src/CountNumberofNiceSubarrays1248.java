import java.util.HashMap;
import java.util.Map;

public class CountNumberofNiceSubarrays1248 {

    //Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
    //
    //Return the number of nice sub-arrays.
    void print(){
        int[] nums ={2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(nums, 2));
    }

    public int numberOfSubarrays(int[] nums, int k) {
        if(nums.length == 0)
            return 0;

        for(int i = 0; i<nums.length;i++){
            nums[i] = nums[i]%2 == 0 ? 0 : 1;
        }

        int[] prefixArray = new int[nums.length];
        prefixArray[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            prefixArray[i] = nums[i] + prefixArray[i-1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i<prefixArray.length;i++){
            map.put(prefixArray[i], map.getOrDefault(prefixArray[i], 0) + 1);
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int required = entry.getKey() - k;
            if(map.containsKey(required)){
                count = count + entry.getValue() * map.get(required);
            }
        }
        return count;

    }
}
