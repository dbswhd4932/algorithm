package 프로그래머스.Lv1;

public class 수박수박수박수박수박수 {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer.append("수");
            }
            else {
                answer.append("박");
            }
        }
        return answer.toString();
    }
}
