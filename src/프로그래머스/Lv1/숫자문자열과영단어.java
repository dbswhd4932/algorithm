package 프로그래머스.Lv1;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        String [] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(arr[i] , Integer.toString(i));
        }

        int answer = Integer.parseInt(s);

        return answer;
    }
}
