public class RotateImage48 {

    void print(){
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(nums);
        int a=1;
    }

    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
         for(int i = 0; i<matrix.length;i++){
             for(int j =0, k = matrix[i].length-1;j<k;j++,k--){
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[i][k];
                 matrix[i][k] = temp;
             }
         }

    }
}
