package DFS_BFS_활용;

import java.util.Scanner;

// 메모이제이션 사용
public class g조합의경우수_DFS_메모이제이션 {
    int [][] dy = new int [35][35]; // 넉넉히

    public int DFS(int n, int r) {
        if ( dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1 , r);

    }

    public static void main(String[] args) {
        g조합의경우수_DFS_메모이제이션 T = new g조합의경우수_DFS_메모이제이션();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int r = sc.nextInt(); // 3
        System.out.println(T.DFS(n, r));
    }
}
