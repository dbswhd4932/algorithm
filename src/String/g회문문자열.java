package String;

/**
 *  풀이날짜 22.09.21
 *  걸린시간 00:03
 */
import java.util.Scanner;

public class g회문문자열 {
    public static String solution(String str) {
        String answer = "";
        str = str.toUpperCase();
        boolean check = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                check = false;
                break;
            }
        }

        if (check) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
