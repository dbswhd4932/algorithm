package BEAKJOON.silver;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  2 초	128 MB	8587	4105	3247	47.492%
 */

import java.util.Arrays;
import java.util.Scanner;

public class _1940 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int s = 0;
        int k = n - 1;
        int sum = 0;
        int count = 0;

        while (s < k) {
            sum = arr[s] + arr[k];

            if (sum < m) {
                s++;
            } else if ( sum > m) {
                k--;
            }

            if (sum == m) {
                count++;
                s++;
                k--;
            }
        }
        System.out.println(count);

    }
}
