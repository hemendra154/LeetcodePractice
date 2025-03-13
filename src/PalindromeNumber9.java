public class PalindromeNumber9 {

    void print(){
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        int i = x;
        long num = 0;
        if (x == 0)
            return false;
        if (x > 0) {
            while (x > 0) {
                num = (x % 10) + num * 10;
                x = x / 10;
            }

            if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE && i == num)
                return true;

        }
        return false;
    }
}
