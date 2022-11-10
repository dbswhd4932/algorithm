package DFS_BFS_활용;

import java.util.Scanner;

public class f순열구하기DFS {
    static int n;
    static int m;
    static int[] arr;
    static int[] check;
    static int[] pm;

    public void DFS(int depth) {
        if (depth == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[depth] = arr[i];
                    DFS(depth + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        f순열구하기DFS T = new f순열구하기DFS();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //3
        m = sc.nextInt(); //2
        arr = new int[n]; // 3 6 9
        check = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        T.DFS(0);
    }
}
