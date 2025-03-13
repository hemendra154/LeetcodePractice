import java.util.Arrays;

public class RotateArray189 {
    void print(){
        int[] nums = {-1};
        int k = 2;
        rotate(nums,k);

    }

    public void rotate(int[] nums, int k) {


//        int[] temp = nums.clone();
//        int j =0;
//        for(int i = temp.length-k; i<temp.length;i++){
//            nums[j++] = temp[i];
//        }
//        for(int i = 0; i<temp.length-k;i++){
//            nums[j++] = temp[i];
//        }
//        for(int i = 0;i<nums.length;i++) {
//            System.out.print(nums[i]);
//        }

        //reverse the array
        k = k % nums.length;
        for(int i = 0, j = nums.length-1; i<j; i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for(int i = 0, j = k-1; i<j && j<nums.length;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for(int i = k, j = nums.length-1; i<j && j<nums.length;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int a = 0;
    }
}
