package 프로그래머스.Lv1;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (budget >= sum) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        예산 T = new 예산();
        System.out.println(T.solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(T.solution(new int[]{2, 2, 3, 3}, 10));

    }
}
