package TwoPointer_SlidingWindow;
/**
 * 풀이날짜 22.10.03
 * 걸린시간 00:25
 * 슬라이딩 윈도우문제
 */

import java.util.Scanner;

public class c최대매출 {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
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
