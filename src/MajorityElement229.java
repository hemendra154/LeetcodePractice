import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement229 {
    void print(){
        int[] nums = {3,2,3};
        majorityElement(nums);
        int a=1;
    }
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i], m.get(nums[i])+1);
            }else{
                m.put(nums[i], 1);
            }
        }

        double check = Math.floor( (double) nums.length/3);
        List<Integer> list = new ArrayList<>();
        for(Integer element : m.keySet()){
            if(m.get(element) > check){
                list.add(element);
            }
        }
        return list;
    }
}
