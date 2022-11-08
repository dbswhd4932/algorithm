package DFS_BFS_활용;

import java.util.Scanner;

public class d중복순열DFS {
    static int[] arr;
    static int n, m;

    public void DFS(int depth) {
        if (depth == 2) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                arr[depth] = i;
                DFS(depth+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        d중복순열DFS T = new d중복순열DFS();

        n = sc.nextInt(); // 3
        m = sc.nextInt(); // 2
        arr = new int[m];

        T.DFS(0);

    }
}
