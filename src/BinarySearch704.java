public class BinarySearch704 {
    void print() {
        int[] num = {1,0,3,5,9,12};
        System.out.println(search(num,9));
    }
    public int search(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;
        int mid = (end-start)/2;

        while(start<end){
            if(nums[mid] == target){
                break;
            }

            if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return mid;
    }
}
