package String;

/**
 *  풀이날짜 22.09.21
 *  걸린시간 00:10
 */
import java.util.Scanner;

public class h유효한팰린드롬 {
    public static String solution(String str) {
        String answer = "YES";

        String s = str.toUpperCase().replaceAll("[^A-Z]", "");

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
