package TwoPointer_SlidingWindow;
/**
 * 풀이날짜 22.10.05
 * 걸린시간 01:00
 */

import java.util.Scanner;

public class f최대길이연속부분수열 {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int count = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[lt] == 0) {
                    count--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
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
