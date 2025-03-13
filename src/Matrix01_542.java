import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix01_542 {

    void print() {
        System.out.println(Arrays.deepToString(updateMatrix(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}})));
    }

    public int[][] updateMatrix(int[][] mat) {

        Queue<int[]> ones = new LinkedList<>();
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1)
                    ones.add(new int[]{i, j});
            }
        }

        if (ones.isEmpty())
            return mat;

        while (!ones.isEmpty()) {
            int[] coordinate = ones.poll();
            int row = coordinate[0];
            int col = coordinate[1];

            mat[row][col] = findNearest0(mat, row, col, rows, cols);
        }

        return mat;
    }

    int findNearest0(int[][] mat, int row, int col, int rows, int cols){
        int left = 0, right = 0, up = 0, down = 0;

        for(int i = col-1; i>=0; i--){
            left++;
            if(mat[row][i] == 0)
                break;
        }
        return right;
    }
}
