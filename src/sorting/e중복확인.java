package sorting;
/**
 * 풀이날짜 22.10.27
 * 걸린시간 00:5
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class e중복확인 {
    static String solution(int n, int[] arr) {
        String answer = "";
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        if (set.size() == n) {
            answer = "U";
        } else {
            answer = "D";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));

    }
}
