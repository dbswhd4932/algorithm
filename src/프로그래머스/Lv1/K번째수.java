package 프로그래머스.Lv1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int [commands[0].length];

        int length = commands[0].length;

        for (int i = 0; i < length; i++) {
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];

            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                arr[j] = array[commands[i][j]];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }
}
