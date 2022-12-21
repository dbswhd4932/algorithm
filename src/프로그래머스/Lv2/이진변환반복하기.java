package 프로그래머스.Lv2;

import java.util.Arrays;
import java.util.Scanner;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[2];

        int count = 0;
        int count_zero = 0;

        while (!s.equals("1")) {
            int count_one = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1') {
                    count_one++;
                } else {
                    count_zero++;
                }
            }
            s = Integer.toBinaryString(count_one);
            count++;
        }
        answer[0] = count;
        answer[1] = count_zero;

        return answer;
    }

    public static void main(String[] args) {
        이진변환반복하기 T = new 이진변환반복하기();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Arrays.toString(T.solution(s)));
    }
}
