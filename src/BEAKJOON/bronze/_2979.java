package BEAKJOON.bronze;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	128 MB	4752	3274	2848	69.328%
 */

import java.util.Scanner;

public class _2979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[101];
        int answer = 0;

        for (int i = 0; i < 3; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    answer += a ;
                    break;
                case 2:
                    answer += b * 2;
                    break;
                case 3:
                    answer += c * 3;
                    break;
            }
        }
        System.out.println(answer);
    }
}
