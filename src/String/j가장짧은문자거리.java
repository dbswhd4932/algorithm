package String;
/**
 * 풀이날짜 22.09.21
 * 걸린시간 00:34
 */

import java.util.Scanner;

public class j가장짧은문자거리 {
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 100;
        }
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                idx = i;

                for (int j = 0; j < answer.length; j++) {
                    if (answer[j] > Math.abs(idx - j)) {
                        answer[j] = Math.abs(idx - j);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
