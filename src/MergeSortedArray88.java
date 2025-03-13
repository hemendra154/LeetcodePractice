import java.util.Arrays;

public class MergeSortedArray88 {
    void print(){
        int[] a = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] b = {1,2,2};
        int n = 3;
        merge(a,m,b,n);
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n == 0){
            return;
        }

        int i = 0, j = 0;
        while(i<m){
            if(nums1[i] <= nums2[j]){
                i++;
            }else{
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i++;
                Arrays.sort(nums2);
            }
        }
        while(i<nums1.length){
            nums1[i++] = nums2[j++];
        }
        int a =1;
    }
}
