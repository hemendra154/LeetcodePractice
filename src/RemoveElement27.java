public class RemoveElement27 {
    void print(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeElement(nums,1));
    }

    public int removeElement(int[] nums, int val)  {
        if(nums.length == 0){
            return 0;
        }
        int unequal = 0;
        for(int i = 0; i<nums.length;i++){
           if(nums[i] != val){
               nums[unequal++] = nums[i];
           }
        }
        return unequal;

    }
}
