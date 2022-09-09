package BEAKJOON.silver;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	256 MB	12463	6624	5349	53.667%
 */

import java.util.Scanner;
import java.util.Stack;

public class _3986 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty() || (stack.peek() != str.charAt(j))) {
                    stack.push(str.charAt(j));
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                count++;
            }
            stack.clear();
        }
        System.out.println(count);
    }
}
