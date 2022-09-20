package String;
/**
 *  풀이날짜 22.09.21
 *  걸린시간 00:06
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class f중복문자제거 {
    public static String solution(String str) {
        HashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
