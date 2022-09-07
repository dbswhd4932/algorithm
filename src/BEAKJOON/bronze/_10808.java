package BEAKJOON.bronze;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	256 MB	30173	20810	17220	69.852%
 */

import java.util.Scanner;

public class _10808 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int [26];

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 'a';
            arr[n]++;
        }

        for (int answer : arr) {
            System.out.print(answer+ " ");
        }

    }
}
