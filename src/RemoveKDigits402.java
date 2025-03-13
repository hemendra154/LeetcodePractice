import java.util.Stack;

public class RemoveKDigits402 {

    void print(){
        System.out.println(removeKdigits("10", 1));
    }
    public String removeKdigits(String num, int k) {

        char[] chars = num.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< chars.length; i++){
            while(!stack.empty() && stack.peek() > chars[i] && k-- > 0){
                stack.pop();
            }
            stack.push(chars[i]);
        }
        while(k-->0 && !stack.empty()){
            stack.pop();
        }
        if(stack.empty())
            return "0";

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.insert(0, stack.pop());
        }
        int i = 0;
        while(i<sb.length() && sb.charAt(i) == '0'){
            i++;
        }

        return i >= sb.length() ? "0" : sb.substring(i);
    }
}
