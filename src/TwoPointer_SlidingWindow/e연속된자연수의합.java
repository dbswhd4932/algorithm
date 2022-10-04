package TwoPointer_SlidingWindow;
/**
 * 풀이날짜 22.10.04
 * 걸린시간 00:05
 */

import java.util.Scanner;

public class e연속된자연수의합 {
    static int solution(int n) {
        int answer = 0;

        int s = 0;
        int e = 1;

        while (e < n / 2 + 2) {
            int sum = 0;
            for (int i = s; i <= e; i++) {
                sum += i;
            }
            if (n < sum) {
                s++;
            }
            if (n > sum) {
                e++;
            }
            if (n == sum) {
                answer++;
                s++;
                e++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
