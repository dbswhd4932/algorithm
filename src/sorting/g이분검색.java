package sorting;
/**
 * 풀이날짜 22.10.27
 * 걸린시간 00:04
 */

import java.util.Arrays;
import java.util.Scanner;

public class g이분검색 {
    static int soulution(int size, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(soulution(n, m, arr));


    }

}
