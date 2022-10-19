package Stack_Queue;
/**
 * 풀이날짜 22.10.19
 * 걸린시간 00:16
 */
import java.util.Scanner;
import java.util.Stack;

public class d후위식연산 {
    static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (48 <= c && c <= 57) {
                stack.push(c - 48);
            } else {
                int b = stack.pop();
                int a = stack.pop();
                if (c == '+') {
                    answer = a + b;
                } else if (c == '*') {
                    answer = a * b;
                } else if (c == '-') {
                    answer = a - b;
                } else if (c == '/') {
                    answer = a / b;
                }
                stack.push(answer);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }
}
