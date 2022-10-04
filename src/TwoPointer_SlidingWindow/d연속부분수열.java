package TwoPointer_SlidingWindow;
/**
 * 풀이날짜 22.10.04
 * 걸린시간 00:15
 */

import java.util.Scanner;

public class d연속부분수열 {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;

        int s = 0;
        int e = 1;

        while (e < n) {
            int sum = 0;
            for (int i = s; i <= e; i++) {
                sum += arr[i];
            }

            if (k > sum) {
                e++;
            }
            if (k < sum) {
                s++;
            }
            if (k == sum) {
                answer++;
                e++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, a));

    }
}
