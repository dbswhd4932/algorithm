package Stack_Queue;
/**
 * 풀이날짜 22.10.20
 * 걸린시간 00:25
 */
import java.util.Scanner;
import java.util.Stack;

public class e쇠막대기 {
    static int solution(String str) {
        int answer = 0;
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push('(');

            } else if (str.charAt(i) == ')') {

                if (str.charAt(i - 1) == '(') {
                    stack.pop();
                    answer += stack.size();

                } else {
                    stack.pop();
                    answer += 1;
                }
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
