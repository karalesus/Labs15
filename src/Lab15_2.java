import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Lab15_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String exp = s.nextLine();
        Stack<Integer> expression = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(') {
                expression.push(i);
            }
            if (c == ')') {
                int startIndex = expression.pop();
                String finalExpression = exp.substring(startIndex, i + 1);
                System.out.println(finalExpression);
            }
        }
    }
}