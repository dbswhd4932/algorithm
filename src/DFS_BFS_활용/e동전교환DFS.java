package DFS_BFS_활용;

import java.util.Scanner;

public class e동전교환DFS {
    static int n;
    static int[] arr;
    static int m;
    static int answer = Integer.MAX_VALUE;

    public void DFS(int depth, int sum, int[] arr) {
        if (sum > m) return;
        if (depth >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, depth);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(depth + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        e동전교환DFS T = new e동전교환DFS();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 동전의 종류개수
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt(); // 거스름 금액

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
