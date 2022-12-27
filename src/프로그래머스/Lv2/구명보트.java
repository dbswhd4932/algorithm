package 프로그래머스.Lv2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[index] + people[i] <= limit) {
                index++;
                answer++;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
