package sorting;
/**
 * 재풀이 필요
 * 풀이날짜 22.10.26
 * 걸린시간 00:40
 */

import java.util.Scanner;

public class dLeastRecentlyUsed {
    static int[] solution(int size, int m, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }


        return cache;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        for (int answer : solution(n, m, arr)) {
            System.out.print(answer + " ");
        }

    }
}
