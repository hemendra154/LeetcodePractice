import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementII503 {

    void print(){
        int[] num1 = {100,1,11,1,120,111,123,1,-1,-100};

        System.out.println(Arrays.toString(nextGreaterElement(num1)));

    }

    public int[] nextGreaterElement(int[] nums2) {

        int[] result = new int[nums2.length];

        for(int i = 0; i< nums2.length; i++){
            int nextMin = Integer.MIN_VALUE;
            for(int j = i+1; j< nums2.length;j++){
                if(nums2[i]< nums2[j]){
                    nextMin = nums2[j];
                    break;
                }
            }
            if(nextMin == Integer.MIN_VALUE){
                for(int j = 0; j< i;j++){
                    if(nums2[i]< nums2[j]){
                        nextMin = nums2[j];
                        break;
                    }
                }
            }
            if(nextMin == Integer.MIN_VALUE)
                nextMin = -1;
            result[i] = nextMin;
        }

        return result;
    }
}
