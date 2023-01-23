package 프로그래머스.Lv2;

import java.util.ArrayList;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];

        ArrayList<String> list = new ArrayList<>();
        boolean check = false;

        for (int i = 0; i < words.length; i++) {
            // 이전에 등장한 단어
            if (list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                check = true;
                break;
            }

            list.add(words[i]);

            // 이전 끝난어와 현재 단어가 다를 경우
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                check = true;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        영어끝말잇기 t = new 영어끝말잇기();
        int[] solution1 = t.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        int[] solution2 = t.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        int[] solution3 = t.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        System.out.println("solution = " + solution1[0]);
        System.out.println("solution = " + solution1[1]);
        System.out.println("solution = " + solution2[0]);
        System.out.println("solution = " + solution2[1]);
        System.out.println("solution = " + solution3[0]);
        System.out.println("solution = " + solution3[1]);

    }
}
