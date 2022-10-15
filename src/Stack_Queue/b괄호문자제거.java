package Stack_Queue;
/**
 * 풀이날짜 22.10.15
 * 걸린시간 00:33
 */
import java.util.Scanner;
import java.util.Stack;

public class b괄호문자제거 {
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == ')') {
                while(stack.pop() != '(');
            } else {
                stack.push(str.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
