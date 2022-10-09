package HashMap_TreeSet;
/**
 * 풀이날짜 22.10.09
 * 걸린시간 00:25
 */
import java.util.HashMap;
import java.util.Scanner;

public class a학급회장 {
    public static char solution(int n, String s) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Character character : map.keySet()) {
            if (map.get(character) > max) {
                max = map.get(character);
                answer = character;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(n, str));
    }
}
