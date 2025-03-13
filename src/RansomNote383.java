import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ranMap = new HashMap<>();
        Map<Character, Integer> magMap = new HashMap<>();

        for(int i = 0; i<ransomNote.length();i++){
            ranMap.put(ransomNote.charAt(i), ranMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for(int i = 0; i<magazine.length();i++){
            magMap.put(magazine.charAt(i), magMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        Set<Character> set = ranMap.keySet();

        for(Character c :set){
            if(ranMap.get(c) > magMap.getOrDefault(c,0))
                return false;
        }

        return true;
    }
}
