import java.util.Arrays;
import java.util.List;

public class FindKthRotation {

    void print() {
        System.out.println(findKRotation(Arrays.asList(5, 1, 2, 3, 4)));
    }

    public int findKRotation(List<Integer> arr) {
        int beg = 0, end = arr.size()-1;

        while(beg<end){
            int mid = beg + (end-beg)/2;

            if(arr.get(mid) > arr.get(end)){
                beg = mid+1;
            }else{
                end = mid;
            }
        }

        return beg;
    }
}
