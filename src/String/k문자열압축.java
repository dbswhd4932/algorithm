package String;

/**
 * 풀이날짜 22.09.23
 * 걸린시간 00:28
 */

import java.util.Scanner;

public class k문자열압축 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }
            if (str.charAt(i) != str.charAt(i + 1) && cnt == 1) {
                sb.append(str.charAt(i));
                cnt = 1;
            }
            if (str.charAt(i) != str.charAt(i + 1) && cnt != 1) {
                sb.append(str.charAt(i));
                sb.append(cnt);
                cnt = 1;
            }
        }
        if ( str.charAt(str.length()-1) != str.charAt(str.length()-2)) {
            sb.append(str.charAt(str.length()-1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
