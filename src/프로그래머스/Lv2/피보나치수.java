package 프로그래머스.Lv2;

import java.util.Scanner;

public class 피보나치수 {
    public int solution(int n) {
        int answer[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) answer[i] = 0;
            else if ( i == 1) answer[i] = 1;
            else {
                int sum = answer[i-2] + answer[i-1];
                answer[i] = sum % 1234567;
            }
        }
        return answer[n];
    }

    public static void main(String[] args) {
        피보나치수 T = new 피보나치수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
