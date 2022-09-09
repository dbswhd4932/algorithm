package BEAKJOON.silver;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  0.5 초 (추가 시간 없음)	128 MB	72063	19518	14362	26.288%
 */

import java.util.Scanner;

public class _1629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(cal(a, b, c) % c);
    }

    static long cal(long a, long b, long c) {
        if (b == 0) {
            return 1;

        } else if (b == 1) {
            return a;

        } else if (b % 2 == 0) {
            long n = cal(a, b / 2, c);
            return (n * n) % c;

        } else if (b % 2 == 1) {
            long n = cal(a, b / 2, c);
            return (((n * n) % c) * a) % c;

        }
        return a;
    }
}
