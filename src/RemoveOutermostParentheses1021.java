import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveOutermostParentheses1021 {

    void print() {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(stack.empty() && c == '('){
                set.add(i);
                stack.push(c);
            }else if(c == ')' && stack.peek() == '('){
                char ch = stack.pop();
                if(stack.empty())
                    set.add(i);
            }else{
                stack.push(c);
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<s.length();i++){
            if(!set.contains(i))
                sb.append(s.charAt(i));
        }

        return sb.toString();

    }
}
