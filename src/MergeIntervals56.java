import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {

    //[[1,3],[2,6],[8,10],[15,18]]
    void print() {
        int[][] matrix = {{1, 4}, {2, 3}};

        merge(matrix);
    }

    public int[][] merge(int[][] inter) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(inter, Comparator.comparingInt(x -> x[0]));
        for(int i = 0 ;i<inter.length;){
            int start = inter[i][0];
            int end = inter[i][1];
            int j = i+1;
            while(j<inter.length && end > inter[j][0]){
                end = Math.max(end, inter[j][1]);j++;
            }

            int[] temp = {start, end};
            result.add(temp);
        }

        int[][] resultArray = new int[result.size()][2];
        int i = 0;
        for (int[] l : result) {
            resultArray[i][0] = l[0];
            resultArray[i][1] = l[1];
            i++;
        }


        return resultArray;
    }
}
