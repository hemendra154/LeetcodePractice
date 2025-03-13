import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {

    void print() {
        System.out.println(isIsomorphic("paper", "title"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);char tch = t.charAt(i);
            if (smap.containsKey(sch) && tch != smap.get(sch)) {
                return false;
            } else {
                smap.put(sch, tch);

            }

            if(tmap.containsKey(tch) && sch != tmap.get(tch)){
                return false;
            }else{
                tmap.put(tch, sch);
            }

        }
        return true;
    }

}
