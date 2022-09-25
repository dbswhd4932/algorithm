package Array;

/**
 *  풀이날짜 22.09.25
 *  걸린시간 00:06
 */

import java.util.Scanner;

public class c가위바위보 {
    public static String solution(int n, int[] a, int [] b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if ( a[i] == b[i]) sb.append("D"+"\n");
            else if ( a[i] == 1 && b[i] == 3) sb.append("A"+"\n");
            else if ( a[i] == 2 && b[i] == 1) sb.append("A"+"\n");
            else if ( a[i] == 3 && b[i] == 2) sb.append("A"+"\n");
            else sb.append("B"+"\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(solution(n,a,b));
    }
}
