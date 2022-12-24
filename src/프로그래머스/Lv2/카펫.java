package 프로그래머스.Lv2;

import java.util.Arrays;
import java.util.Scanner;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];

        int sum = brown + yellow ;
        for(int i = sum/2; i > 2; i--) {
            if(sum % i == 0 && ((i-2) * (sum / i - 2)) == yellow) {
                answer[0] = i;
                answer[1] = sum / i;
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        카펫 T = new 카펫();
        System.out.println(Arrays.toString(T.solution(a, b)));
    }
}
