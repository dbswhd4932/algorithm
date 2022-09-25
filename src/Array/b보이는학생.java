package Array;

/**
 *  풀이날짜 22.09.25
 *  걸린시간 00:08
 */

import java.util.Scanner;

public class b보이는학생 {
    public static int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if ( max < arr[i+1]) {
                answer++;
                max = arr[i+1];
            }
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
        System.out.println(solution(n,arr));
    }
}
