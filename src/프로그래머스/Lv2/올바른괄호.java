package 프로그래머스.Lv2;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (stack.isEmpty()) {
                if (c == ')') {
                    answer = false;
                    break;
                }
            }

            if (c == '(') stack.push('(');
            else stack.pop();
        }

        if (!stack.isEmpty()) answer = false;
        return answer;
    }

    public static void main(String[] args) {
        올바른괄호 T = new 올바른괄호();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }
}
