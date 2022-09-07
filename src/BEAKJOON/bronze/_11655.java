package BEAKJOON.bronze;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	256 MB	16427	9988	8593	61.825%
 */

import java.util.Scanner;

public class _11655 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (65 <= str.charAt(i) && str.charAt(i) <= 77) {
                System.out.print((char) (str.charAt(i) + 13));
            } else if (78 <= str.charAt(i) && str.charAt(i) <= 90) {
                System.out.print((char) (str.charAt(i) - 26 + 13));
            } else if (97 <= str.charAt(i) && str.charAt(i) <= 109) {
                System.out.print((char) (str.charAt(i) + 13));
            } else if (110 <= str.charAt(i) && str.charAt(i) <= 122) {
                System.out.print((char) (str.charAt(i) - 26 + 13));
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
