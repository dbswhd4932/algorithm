package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 풀이날짜 22.10.20
 * 걸린시간 00:40
 */
public class g교육과정설계 {
    static String solution(String str1, String str2) {
        String answer = "YES";
        int num = Integer.MIN_VALUE;
        int count = 0;

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str1.length(); i++) {
            queue.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            if (queue.contains(str2.charAt(i))) {
                if ( queue.poll() != str2.charAt(i)){
                    answer="NO";
                    break;
                }
            }
        }
        if (!queue.isEmpty()) {
            answer = "NO";
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
