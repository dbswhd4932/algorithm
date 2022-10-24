package sorting;
/**
 * 풀이날짜 22.10.24
 * 걸린시간 00:11
 */
import java.util.Arrays;
import java.util.Scanner;

public class a선택정렬 {
    static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if ( arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int answer : solution(n,arr)) {
            System.out.print(answer+ " ");
        }

    }
}
