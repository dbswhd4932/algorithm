package 프로그래머스.Lv2;

import java.util.Arrays;

public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer =h;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        H_Index T = new H_Index();
        System.out.println(T.solution(new int[]{3, 0, 6, 1, 5}));
    }
}
