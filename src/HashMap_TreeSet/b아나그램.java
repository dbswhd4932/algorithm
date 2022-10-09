package HashMap_TreeSet;
/**
 * 풀이날짜 22.10.09
 * 걸린시간 00:20
 */
import java.util.*;

public class b아나그램 {
    public static String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if(!map.containsKey(s2.charAt(i)) || map.get(s2.charAt(i))==0){
                answer = "NO";
                break;
            }
            map.put(s2.charAt(i), map.get(s2.charAt(i))-1);

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(solution(str1, str2));
    }
}
