package Array;
/**
 *  풀이날짜 22.09.27
 *  걸린시간 00:17
 */
import java.util.Scanner;

public class i격자판최대합 {
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
                if (max < sum) {
                    max = sum;
                }
            }
            sum = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
                if (max < sum) {
                    max = sum;
                }
            }
            sum = 0;
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            if (max < sum) {
                max = sum;
            }
        }
        sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][n - i - 1];
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
