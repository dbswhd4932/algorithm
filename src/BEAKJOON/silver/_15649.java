package BEAKJOON.silver;

import java.util.Scanner;

public class _15649 {
    static int n, m;
    static int[] arr;
    static int[] check;

    public static void DFS(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) continue;
                check[i] = 1;
                arr[depth] = i;
                DFS(depth + 1);
                check[i] = 0;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        check = new int[n + 1];

        DFS(0);


    }
}
