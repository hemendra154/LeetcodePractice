import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    void print(){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int left = 0, right;

        for(int i = left; i < s.length(); i++){
            right = i;
            while(right<s.length()){
                if(set.contains(s.charAt(right))){
                    set = new HashSet<>();
                    break;
                }else{
                    maxLength = Math.max(maxLength,(right-i+1));
                    set.add(s.charAt(right));
                    right++;
                }
            }
        }
        return maxLength;

    }
}
