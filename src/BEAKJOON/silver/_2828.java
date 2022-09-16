package BEAKJOON.silver;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	128 MB	5497	2568	2176	48.582%
 */

import java.util.Scanner;

public class _2828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();

        int left = 1;
        int right = left + (m - 1);

        int move = 0;
        for (int i = 0; i < j; i++) {
            int location = sc.nextInt();

            if (location > right) {
                move += location - right;
                right = location;
                left = right - m + 1;
            } else if (location < left) {
                move += left - location;
                left = location;
                right = left + m - 1;
            }
        }
        System.out.println(move);
    }
}
