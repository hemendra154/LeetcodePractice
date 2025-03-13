import java.util.Stack;

public class MinimumAddToMakeParenthesesValid921 {

    void print(){
        System.out.print(minAddToMakeValid("()))(("));
    }


    public int minAddToMakeValid(String s) {


        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i< s.length();i++){
            if(stack.isEmpty()) {
                stack.add(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
            }else{
                stack.add(s.charAt(i));
            }
        }

        return stack.size();
    }
}
