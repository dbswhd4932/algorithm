package 프로그래머스.Lv2;

import java.util.Scanner;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int add = 0;
            while (true) {
                add += num;
                if ( add == n) {
                    answer++;
                    break;
                } else if ( add > n) {
                    break;
                }
                num++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자의표현 T = new 숫자의표현();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));

    }
}
