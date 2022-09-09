package BEAKJOON.silver;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	128 MB	12788	4167	3202	32.511%
 */

import java.util.Scanner;

public class _4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = 0;
            int count = 0;

            while(true) {
                num = num * 10 + 1;
                num = num % n;
                count++;

                if(num == 0 ) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
