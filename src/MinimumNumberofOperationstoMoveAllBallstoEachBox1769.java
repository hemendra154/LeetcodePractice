import java.util.Arrays;

public class MinimumNumberofOperationstoMoveAllBallstoEachBox1769 {

    void print() {
        System.out.println(Arrays.toString(minOperations("001011")));
    }

    public int[] minOperations(String boxes) {
        int size = boxes.length();
        int[] result = new int[boxes.length()];
        for(int i = 0; i<size; i++){
            result[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            for(int j = i+1; j<size;j++){
                if(boxes.charAt(j) == '1'){
                    result[i] = result[i] + j - i;
                }
            }
        }

        for (int i = size-1; i >-1; i--) {
            for(int j = i-1; j>-1;j--){
                if(boxes.charAt(j) == '1'){
                    result[i] = result[i] + i - j;
                }
            }
        }

        return result;
    }
}
