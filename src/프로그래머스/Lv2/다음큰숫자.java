package 프로그래머스.Lv2;

import java.util.Scanner;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        int clone = n;
        int zeroCount = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') zeroCount ++;
        }

        while(true) {
            clone++;
            int zeroCountSame = 0;
            String s1 = Integer.toBinaryString(clone);
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) == '1') {
                    zeroCountSame++;
                }
            }
            if ( zeroCount == zeroCountSame) {
                answer = clone;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        다음큰숫자 T = new 다음큰숫자();
        System.out.println(T.solution(n));
    }
}
