import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class NextPermutation31 {
    void print(){
        int[] nums = {2,3,1,3,3};
        nextPermutation(nums);
        System.out.print("");
    }

    public void nextPermutation(int[] nums) {

        int size = nums.length;
        int i = size-2;
        for(;i>=0;i--){
            if(nums[i]<nums[i+1])
                break;
        }
        int start;
        if(i == -1){
            start = 0;
        }else{
            int diff = nums[i+1]-nums[i];
            start = i;
            int end = i+1;
            for(int j = i+2; j< size;j++){
                if(nums[j]-nums[i] >0 && nums[j]-nums[i] <= diff){
                    diff = nums[j]-nums[i];
                    end = j;
                }
            }
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
        }
        int end = size-1;
        for(;start<end;start++,end--){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
}
