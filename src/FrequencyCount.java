import java.util.*;
import java.util.stream.Collectors;

public class FrequencyCount {
    public void print(){
        System.out.println("FrequencyCount\n\n");
        String random = "asjnfjfhwdufhunshajfaksjfjanjvajaknfanjfdsbjabjaa";
        List<Character> list = new ArrayList<>();
        for(char c : random.toCharArray()){
            list.add(c);
        }
        Map<Character, Long> frequency = list.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(random);
        System.out.println(frequency);


    }
}
