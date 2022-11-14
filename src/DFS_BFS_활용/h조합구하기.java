package DFS_BFS_활용;

import java.util.Scanner;

public class h조합구하기 {
    static int n, m;
    static int [] arr;
    public void DFS(int depth, int num) {
        if ( depth == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = num; i <= n; i++) {
                arr[depth] = i;
                DFS(depth+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        h조합구하기 T = new h조합구하기();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 4
        m = sc.nextInt(); // 2
        arr = new int [m];

        T.DFS(0,1);

    }
}
