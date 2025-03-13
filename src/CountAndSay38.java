import java.util.LinkedHashMap;
import java.util.Map;

public class CountAndSay38 {


    void print(){
        System.out.println(countAndSay(4));
    }

    public String countAndSay(int n) {
        String result = "";
        for(int i = 1; i<= n ; i++){
            if(i == 1) {
                result = "1";
                continue;
            }
            result = helper(result);
        }

        return result;
    }

    String helper(String s){
        Map<Character, Integer> count = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        count.put(s.charAt(0), 1);
        if(s.length() == 1){
            result.append(count.get(s.charAt(0))).append(s.charAt(0));
        }
        for(int i = 1 ;i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                result.append(count.get(s.charAt(i-1))).append(s.charAt(i-1));
                count.put(s.charAt(i-1), 0);
                count.put(s.charAt(i), 1);
            }else{
                count.put(s.charAt(i), count.get(s.charAt(i)) +1);
            }
            if(i == s.length()-1){
                result.append(count.get(s.charAt(i))).append(s.charAt(i));
            }
        }

        return result.toString();
    }


}
