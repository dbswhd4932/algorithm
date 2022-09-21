package String;
/**
 * 풀이날짜 22.09.21
 * 걸린시간 00:05
 */

import java.util.Scanner;

public class i숫자만추출 {
    public static int solution(String str) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (48 <= str.charAt(i) && str.charAt(i) <= 57) {
                sb.append(str.charAt(i));
            }
        }
        answer = Integer.parseInt(sb.toString());

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
