package BEAKJOON.bronze;

import java.util.Scanner;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	17537	11641	10049	67.780%
 */
public class _10988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean check = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
