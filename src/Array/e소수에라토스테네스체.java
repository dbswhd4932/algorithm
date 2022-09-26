package Array;
/**
 *  풀이날짜 22.09.26
 *  걸린시간 00:20
 */
import java.util.Scanner;

public class e소수에라토스테네스체 {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j < n + 1; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
