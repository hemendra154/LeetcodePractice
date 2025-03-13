import java.util.PriorityQueue;

public class KthLargestElementinanArray215 {

    void print(){
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i< nums.length;i++){
            minHeap.add(nums[i]);

            if(minHeap.size() > k)
                minHeap.poll();
        }

        return  minHeap.peek();
    }
}
