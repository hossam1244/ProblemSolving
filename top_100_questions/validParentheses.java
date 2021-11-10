import java.util.Stack;

public class validParentheses {


    public static void main(String[] args) {

        String s = "()[]{}";


        isValid(s);

    }


    static public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<n; i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {

                if (stack.size() == 0) return false;
                Character c = stack.pop();
                if (s.charAt(i) != ')' && c == '(') return false;
                if (s.charAt(i) != ']' && c == '[') return false;
                if (s.charAt(i) != '}' && c == '{') return false;

            }
        }

        if(stack.size()>0){return false;}
        return true;

    }
}
