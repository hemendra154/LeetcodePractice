import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpiralMatrix54 {

    void print(){
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        ;
        System.out.println(spiralOrder(nums));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0,bottom = matrix.length-1,left = 0, right = matrix[0].length-1;
        while(top<=bottom && left <=right){
            for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;
    }
}
