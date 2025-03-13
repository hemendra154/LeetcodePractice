import java.util.Arrays;

public class LengthOfLastWord58 {
    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //Input: s = "Hello World"
    //Output: 5
    //Explanation: The last word is "World" with length 5.
    void print(){
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        String[] sarray = s.split(" ");
        String result = sarray[sarray.length-1].trim();
        return result.length();
    }
}
