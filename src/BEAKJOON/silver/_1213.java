package BEAKJOON.silver;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  2 초	128 MB	13095	5218	4232	39.474%
 */

import java.util.Scanner;

public class _1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int [] arr = new int [26];

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 'A';
            arr[n]++;
        }
        //System.out.println(Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) {
                count ++;
            }
        }

        if ( count > 1 ) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j < arr[i]/2; j++) {
                    sb.append((char)(i +'A'));
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] % 2 == 1) {
                sb.append((char)(i +'A'));
            }
        }
        //System.out.println(sb);

        for (int i = arr.length-1; i >= 0 ; i--) {
            if ( arr[i] > 1 ) {
                for (int j = 0; j < arr[i]/2; j++) {
                    sb2.append((char)(i+'A'));
                }
            }
        }
        sb.append(sb2);
        System.out.println(sb);

    }
}
