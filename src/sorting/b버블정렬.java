package sorting;
/**
 * 풀이날짜 22.10.26
 * 걸린시간 00:11
 */
import java.util.Scanner;

public class b버블정렬 {
    static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if ( arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
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
