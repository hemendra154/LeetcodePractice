public class ReverseWordsInAString151 {
    void print() {
        System.out.println(reverseWords("a good   example"));
    }
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();

        s = s.trim();
        for(int i = s.length()-1; i>=0; ){
            int start = i;
            int end = i;
            while(start>=0 && s.charAt(start) == ' ' && sb.charAt(sb.length()-1) == ' '){
                start--;
                end--;
            }
            while(start>=0){
                if(s.charAt(start) == ' ')
                    break;
                start--;
            }
            i = start-1;
            for(int k = start+1; k<=end;k++){
                sb.append(s.charAt(k));
            }
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}
