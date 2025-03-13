import java.util.*;

public class StringMatchinginanArray1408 {

    void print(){
        String[] words = {"mass","as","hero","superhero"};
        stringMatching(words);
    }

    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        List<String> input = Arrays.asList(words);

        input.sort(Comparator.comparing(String::length));

        for(int i =0; i<input.size(); i++){
            for(int j = i+1; j< input.size();j++){
                if(input.get(j).contains(input.get(i))){
                    result.add(input.get(i));
                    break;
                }
            }
        }

        return result;
    }
}
