package Stack_Queue;
/**
 * 풀이날짜 22.10.12
 * 걸린시간 00:13
 */

import java.util.Scanner;
import java.util.Stack;

public class a올바른괄호 {
    static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(i));
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            return answer;
        } else {
            answer = "NO";
            return answer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }
}
