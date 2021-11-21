import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        System.out.println(balanced1("[()]{}{[()()]()}"));
        System.out.println(balanced1("[(])”"));
        System.out.println(balanced2("[()]{}{[()()]()}"));
        System.out.println(balanced2("[(])”"));

    }

    public static boolean balanced1(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }


    public static boolean balanced2(String braces) {
        Stack<Character> stack = new Stack<Character>();

        for(char c : braces.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if((c == ')' && (stack.isEmpty() || stack.pop() != '(')) ||
                    (c == ']' && (stack.isEmpty() || stack.pop() != '[')) ||
                    (c == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
