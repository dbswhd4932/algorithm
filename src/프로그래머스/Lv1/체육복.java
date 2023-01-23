package 프로그래머스.Lv1;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 체육복을 도난당했을 때
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 여벌 체육복을 빌렸을 때
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        체육복 t = new 체육복();
        int solution = t.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        int solution2 = t.solution(5, new int[]{2, 4}, new int[]{3});
        int solution3 = t.solution(3, new int[]{3}, new int[]{1});
        System.out.println("solution = " + solution);
        System.out.println("solution2 = " + solution2);
        System.out.println("solution3 = " + solution3);

    }
}
