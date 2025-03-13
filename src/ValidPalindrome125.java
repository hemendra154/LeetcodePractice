public class ValidPalindrome125 {
    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.

    Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
     */
    void print(){
        String s = "0P";
        System.out.println(isPalindrom(s));
    }

    public boolean isPalindrom(String s) {
        StringBuffer sb = new StringBuffer();
        char[] ch = s.toLowerCase().toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
        return sb.toString().contentEquals(sb.reverse());
    }


}
