package TwoPointer_SlidingWindow;
/**
 * 풀이날짜 22.10.01
 * 걸린시간 00:10
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class b공통원소구하기 {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int n1 = 0;
        int n2 = 0;

        while (n1 < n && n2 < m) {
            if (a[n1] == b[n2]) {
                list.add(a[n1]);
                n1++;
                n2++;
            } else {
                if (a[n1] > b[n2]) {
                    n2++;
                } else {
                    n1++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int answer : solution(n, m, a, b)) {
            System.out.print(answer + " ");
        }
    }
}
