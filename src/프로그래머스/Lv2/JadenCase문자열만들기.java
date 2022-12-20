package 프로그래머스.Lv2;

import java.util.Scanner;

public class JadenCase문자열만들기 {

    public String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");
        for (String str : split) {
            if (str.length() == 0) answer += " ";
            else {
                answer += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
                answer += " ";
            }
        }

        if (s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        return answer.substring(0, answer.length() - 1);
    }

    public static void main(String[] args) {
        JadenCase문자열만들기 T = new JadenCase문자열만들기();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(T.solution(s));

    }
}
