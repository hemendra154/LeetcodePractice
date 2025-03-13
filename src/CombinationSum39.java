import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class CombinationSum39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0, j = candidates.length-1;i<j;){
            int sum = candidates[i] + candidates[j];
            if(sum == target){
                result.add(Arrays.asList(candidates[i], candidates[j]));
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i< candidates.length;i++){
            int num = candidates[i];
            set.add(num);
            if(target % num == 0){
                int count = target/num;
                List<Integer> list = new ArrayList<>();
                while(count>0){
                    list.add(num);
                    count--;
                }
                result.add(list);
            }else{
                int remainder = target % num;
                if(set.contains(remainder));

            }
        }
        return result;

    }
}
