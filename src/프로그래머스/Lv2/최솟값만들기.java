package 프로그래머스.Lv2;

import java.util.Arrays;
import java.util.Scanner;

public class 최솟값만들기 {

    public int solution(int[] A, int[] B) {
        int answer = 0;
        int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < len; i++) {
            answer += A[i] * B[len-1-i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        최솟값만들기 T = new 최솟값만들기();

    }
}
