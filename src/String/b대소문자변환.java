package String;

import java.util.Scanner;

/**
 *  풀이날짜 22.09.19
 *  걸린시간 00:05
 */
public class b대소문자변환 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ( 65 <= str.charAt(i) && str.charAt(i) <= 90) {
                sb.append(String.valueOf(str.charAt(i)).toLowerCase());
            } else {
                sb.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
