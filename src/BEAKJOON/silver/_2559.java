package BEAKJOON.silver;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	128 MB	22654	8306	6771	36.466%
 */

import java.util.Scanner;

public class _2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = k;
        int max = Integer.MIN_VALUE;

        while (e <= n) {
            int sum = 0;
            for (int i = s; i < e; i++) {
                sum += arr[i];
            }
            max = Math.max(max,sum);
            s++;
            e++;
        }
        System.out.println(max);
    }
}
