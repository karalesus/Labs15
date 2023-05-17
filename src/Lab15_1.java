import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Lab15_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        Stack<Integer> nums = new Stack<>();
        while (a != 0) {
            nums.push(a % 2);
            a = a / 2;
        }
        nums.forEach(System.out::print);
    }
}
