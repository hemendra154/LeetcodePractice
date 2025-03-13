import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement424 {

    void print(){
        System.out.println(characterReplacement("AABABBA", 1));
    }
    public int characterReplacement(String s, int k) {

        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        for(int right = 0; right<s.length(); right++){
            char current = s.charAt(right);
            map.put(current, map.containsKey(current) ? map.get(current) + 1: 1);

            maxFreq = Math.max(maxFreq, map.get(current));

            int window = right - left + 1;

            if(window- maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
