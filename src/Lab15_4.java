import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Lab15_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Deque<String> order = new ArrayDeque<>();
        String line = "";
        while (!"print".equals(line = s.nextLine())) {
            if (line.equals("cancel")) {
                if (order.isEmpty()) {
                    System.out.println("Printer is on standby");
                }
                if (!order.isEmpty()) {
                    String cancelled = order.poll();
                    System.out.println("Cancelled " + cancelled);
                }
            } else {
                order.offer(line);
            }
            }
        order.forEach(System.out::println);
        }
    }
