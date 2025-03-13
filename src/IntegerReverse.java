public class IntegerReverse {
    void print(){
        int x = -132;
        System.out.println(reverse(x));
    }

    public int reverse(int x) {
        int reverse  = 0;
        while(x!=0){
            int digit = x%10;
            reverse = reverse*10 + digit;
            x = x/10;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return reverse;
    }
}
