package 프로그래머스.Lv2;


import java.util.Scanner;

public class 최댓값과최솟값 {

    public String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String StringNum : split) {
            int num = Integer.parseInt(StringNum);

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        answer = min + " " + max;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        최댓값과최솟값 T = new 최댓값과최솟값();
        System.out.println(T.solution(s));
    }
}
