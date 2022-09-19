package String;
/**
 *  풀이날짜 22.09.19
 *  걸린시간 00:13
 */

import java.util.ArrayList;
import java.util.Scanner;

public class d단어뒤집기 {
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str[i]).reverse();
            answer.add(sb.toString());
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String s : solution(n, str)) {
            System.out.println(s);
        }
    }
}
