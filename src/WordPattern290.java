import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    void print(){
        wordPattern("abba", "dog dog dog dog");
    }
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
        String[] sa = s.split(" ");

        for(int i = 0; i< pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = sa[i];
            if(!map.containsKey(ch) && !map1.containsKey(word)){
                map.put(ch,word);
                map1.put(word,ch);
            }else if((map.containsKey(ch) && !map.get(ch).equals(word) )
                    ||(!map.containsKey(ch) && map1.containsKey(word))){
                return false;
            }
        }
        return true;
    }
}
