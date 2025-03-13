

public class CountPrefixandSuffixPairsI3042 {

    void print() {
        String[] words = {"a", "aba", "ababa", "aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for(int i = 0; i < words.length; i++){
            String check = words[i];
            for(int j = i+1; j < words.length;j++){
                String word = words[j];
                if(check.length() > word.length())
                    continue;
                if(word.startsWith(check) && word.endsWith(check))
                    count++;
            }
        }

        return count;
    }
}
