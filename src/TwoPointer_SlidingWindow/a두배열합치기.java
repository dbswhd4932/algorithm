package TwoPointer_SlidingWindow;
/**
 *  풀이날짜 22.10.01
 *  걸린시간 00:05
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a두배열합치기 {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            list.add(b[i]);
        }

        Collections.sort(list);

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
