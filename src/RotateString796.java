public class RotateString796 {

    void print(){
        System.out.println(rotateString("abcde","cdeab"));
    }
    public boolean rotateString(String s, String goal) {

        int K = s.indexOf(goal.charAt(0));

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();

        StringBuffer sb1 = new StringBuffer(sb.subSequence(0, s.length()-K));
        StringBuffer sb2 = new StringBuffer(sb.subSequence(s.length()-K, s.length()));

        StringBuffer result = sb1.reverse().append(sb2.reverse());

        return result.toString().equals(goal);
    }
}
