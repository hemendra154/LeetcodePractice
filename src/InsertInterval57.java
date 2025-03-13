import java.util.ArrayList;
import java.util.List;

public class InsertInterval57 {

    void print(){
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};

        int[] newInterval = {4,8};

        insert(intervals,newInterval);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> resultList = new ArrayList<>();
        int[] tempInterval = {0,0};

        int i = 0;
        while(i<intervals.length){
            if(intervals[i][1] >= newInterval[0])
                break;

            resultList.add(intervals[i]);
            i++;
        }

        while(i<  intervals.length  && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);

            i++;
        }
        resultList.add(newInterval);

        while(i< intervals.length){
            resultList.add(intervals[i]);
            i++;
        }

        return resultList.toArray(new int[resultList.size()][]);


    }
}
