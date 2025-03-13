import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutation {

    void print(){
        List<Integer> digits = Arrays.asList(1,2,3);
        List<List<Integer>> s = permutation(digits);
//        Collections.sort(s);
        System.out.println();
        System.out.println(s.toString());
    }

    private List<List<Integer>> permutation(List<Integer> nums){
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        solve(nums, result, index);
        return result;
    }

    private void solve(List<Integer> nums, List<List<Integer>> result, int index){
        if(index == nums.size()-1){
            result.add(new ArrayList<>(nums));
            return;
        }
        for (int i = index; i < nums.size(); i++) {
            Collections.swap(nums, index, i);
            solve(nums, result, index + 1);
            Collections.swap(nums, index, i);
        }

    }
}
