import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes73 {
    //Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    void print(){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

       setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {
        Set<Integer> iValue = new HashSet<>();
        Set<Integer> jValue = new HashSet<>();
        for(int i = 0; i< matrix.length; i++){
            for(int j =0; j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    iValue.add(i);
                    jValue.add(j);
                }
            }
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j =0; j<matrix[i].length;j++){
                if(iValue.contains(i) || jValue.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }

}
