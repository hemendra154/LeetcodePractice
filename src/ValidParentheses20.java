import java.util.Stack;

public class ValidParentheses20 {
    void print(){
        String  s = "}";
        System.out.println(isValid(s));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' ||c == '{' )
                stack.push(c);
            else if(!stack.empty()){
                Character popped = stack.pop();
                switch(c){
                    case '}':
                        if(popped!='{')
                            return false;
                        break;
                    case ')':
                        if(popped!='(')
                            return false;
                        break;
                    case ']':
                        if(popped!='[')
                            return false;
                        break;
                }
            }else{
                return false;
            }
        }
        return stack.empty();
    }
}
