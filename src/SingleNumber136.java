import java.util.Arrays;

public class SingleNumber136 {
    void print(){
        int[] nums = {2,2,1};
        System.out.print(singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int single = nums[0];
        for(int i = 1; i<nums.length;){
            if(single == nums[i]){
                single = nums[i+1];
                i = i+2;
            }else{
                break;
            }
        }
        return single;
    }
}
