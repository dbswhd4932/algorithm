package DFS_BFS_활용;

import java.util.Scanner;

public class a합이같은부분집합DFS {
    static String answer = "NO";
    static int n;
    static int total;

    public void DFS(int depth, int sum, int[] arr) {
        if ( sum > total / 2 ) return;
        if (depth == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                return;
            };
        } else {
            DFS(depth + 1, sum + arr[depth], arr);
            DFS(depth + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        a합이같은부분집합DFS T = new a합이같은부분집합DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
