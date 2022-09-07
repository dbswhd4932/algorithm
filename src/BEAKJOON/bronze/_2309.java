package BEAKJOON.bronze;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  2 초	128 MB	93532	38406	27887	42.471%
 */

import java.util.Arrays;
import java.util.Scanner;

public class _2309 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int [9];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int dif = sum - 100;

        all:
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == dif) {
                    arr[i] = 0;
                    arr[j] = 0;
                    break all;
                }
            }
        }
        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
