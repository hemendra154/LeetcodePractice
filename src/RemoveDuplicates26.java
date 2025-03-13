public class RemoveDuplicates26 {
    void print(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int unique = 0;
        for(int i = 1; i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[++unique] = nums[i];
            }
        }
        return unique+1;

    }
}
