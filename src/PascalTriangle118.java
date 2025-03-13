import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    void print(){
        generate(5);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i< numRows; i++){
            List<Integer> r = new ArrayList<>();
            for(int j = 0; j<=i;j++){
                if(j == 0 || j==i){
                    r.add(1);
                }else{
                    int num = result.get(i-1).get(j-1)+result.get(i-1).get(j);
                    r.add(num);
                }
            }
            result.add(r);
        }

        return result;
    }
}
