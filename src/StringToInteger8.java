import java.math.BigInteger;

public class StringToInteger8 {

    void print(){
        System.out.println(myAtoi("+12"));
    }

    /*
    The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.
     */
    public int myAtoi(String s) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i<s.length();i++){
            char c= s.charAt(i);
            int l = sb.length();
            if(c == ' ' && l == 0){
                continue;
            }else if((c == '-' || c == '+') && l == 0){
                sb.append(c);
            }else if(c>= '0' && c <= '9' ){
                sb.append(c);
            }else{
                break;
            }
        }
        if(sb.length() == 0 || (sb.length() == 1 && (sb.charAt(0) =='-' || sb.charAt(0) =='+')))
            return 0;

        BigInteger x = new BigInteger(sb.toString());

        if(x.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0){
            return Integer.MAX_VALUE;
        }
        if(x.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) < 0){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(sb.toString());
    }
}
