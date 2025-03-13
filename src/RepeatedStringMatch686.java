public class RepeatedStringMatch686 {

    void print(){
        System.out.print(repeatedStringMatch("abcd", "cdabcdab"));
    }
    public int repeatedStringMatch(String a, String b) {
        if(b.equals(""))
            return 0;
        int multi = (int) Math.ceil((double) b.length() /a.length());
        StringBuilder s = new StringBuilder();
        for(int i = 1; i <= multi+1 ;i++){
            s.append(a);
            if(s.indexOf(b) != -1)
                return i;
        }
        return -1;
    }
}
