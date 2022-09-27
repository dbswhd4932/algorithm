package Array;
/**
 *  풀이날짜 22.09.27
 *  걸린시간 00:10
 */
import java.util.Scanner;

public class h등수구하기 {
    public static int[] solution(int n, int[] arr) {
        int [] answer = new int [n];

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j] ) {
                    rank++;
                }
            }
            answer[i] = rank;
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

        for (int answer : solution(n,arr)) {
            System.out.print(answer + " ");
        }
    }
}
