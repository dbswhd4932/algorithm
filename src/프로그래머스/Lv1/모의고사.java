package 프로그래머스.Lv1;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (p1[i % p1.length] == answers[i]) s1++;
            if (p2[i % p2.length] == answers[i]) s2++;
            if (p3[i % p3.length] == answers[i]) s3++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(s2, s3), s1);
        if (max == s1) list.add(1);
        if (max == s2) list.add(2);
        if (max == s3) list.add(3);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
