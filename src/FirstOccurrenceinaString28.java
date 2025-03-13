public class FirstOccurrenceinaString28 {
    void print(){
        System.out.println(strStr("mississippi","issipi"));
    }

    public int strStr(String haystack, String needle) {
        int resultIndex = -1;
        for(int i = 0; i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0) && resultIndex == -1){
                boolean match = true;
                for(int j = 1; j<needle.length();j++){
                    if(i+j >= haystack.length()) {
                        match = false;
                        break;
                    }
                    if(haystack.charAt(i+j) != needle.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if(match)
                    resultIndex = i;
            }
        }
        return resultIndex;
    }
}
