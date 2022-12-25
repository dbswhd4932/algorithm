package 프로그래머스.Lv2;

import java.util.Scanner;
import java.util.Stack;

public class 짝지어제거하기 {
    public int solution(String s) {
        int answer = 1;
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty()) stack.add(s.charAt(i));
            else if (stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }

        if (!stack.isEmpty()) answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        짝지어제거하기 T = new 짝지어제거하기();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(T.solution(s));
    }
}
