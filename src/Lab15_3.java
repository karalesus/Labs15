import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Lab15_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();
        if (isBalanced(expression)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> Stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                Stack.push(c);
            } else {
                if ((Stack.peek() == '{' && c == '}') ||
                        (Stack.peek() == '[' && c == ']') ||
                        (Stack.peek() == '(' && c == ')')) {
                    Stack.pop();
                } else {
                    return false;
                }
            }
        }
        return Stack.isEmpty();
    }
}