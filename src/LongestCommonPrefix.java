
import java.util.Arrays;

public class LongestCommonPrefix {
    void print(){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        for(int i = 0; i<s1.length();i++){
            if(s1.charAt(i) == s2.charAt(i))
                prefix.append(s1.charAt(i));
            else
                break;
        }
        return prefix.toString();
    }
}
