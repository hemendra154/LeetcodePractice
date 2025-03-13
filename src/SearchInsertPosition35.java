public class SearchInsertPosition35 {
    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    void print(){
        int[] nums = {1,3,5,6};int target = 2;
        System.out.println(searchInsert(nums,target));
    }

    public int searchInsert(int[] nums, int target) {
        int beg = 0, end = nums.length-1, mid =-1;

        while(beg<=end){
            mid = beg + (end-beg)/2;
            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid]){
                beg=mid+1;
            }else{
                end = mid -1;
            }
        }
        if(target>nums[mid])
            return mid+1;
        return mid;
    }
}
