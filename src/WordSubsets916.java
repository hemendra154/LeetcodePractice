import java.util.*;
import java.util.stream.Stream;

public class WordSubsets916 {
    void print(){
        String[] words1 = {"acaac","cccbb","aacbb","caacc","bcbbb"};
        String[] words2 = {"c","cc","b"};

        wordSubsets(words1,words2);
    }


    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        List<Map<Character, Integer>> listMapWord1 = new ArrayList<>();
        for(String word : words1){
            Map<Character, Integer> map = new HashMap<>();
            for(char ch : word.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            listMapWord1.add(map);
        }

        List<Map<Character, Integer>> listMapWord2 = new ArrayList<>();
        for(String word : words2){
            Map<Character, Integer> map = new HashMap<>();
            for(char ch : word.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            listMapWord2.add(map);
        }
        int i = 0;

        for(Map<Character, Integer> map1 : listMapWord1){
            boolean flag = true;
            for(Map<Character, Integer> map2 : listMapWord2){
                boolean flag1 = false;
                for(Character ch : map2.keySet()){
                    if(!map1.containsKey(ch) || map1.get(ch) < map2.get(ch)){
                        flag1 = true;
                        break;
                    }
                }
                if(flag1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result.add(words1[i]);
            }
            i++;
        }



        return result;
    }
}
