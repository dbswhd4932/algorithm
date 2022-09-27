package Array;
/**
 *  풀이날짜 22.09.27
 *  걸린시간 00:05
 */
import java.util.Scanner;

public class g점수계산 {
    public static int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                score++;
            } else {
                score = 0;
            }
            answer += score;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
