package DFS_BFS_활용;

import java.util.Scanner;

public class c최대점수구하기DFS {
    static int answer;
    static int n, m;

    public void DFS(int depth, int sum, int time, int[] ps, int[] pt) {
        if (depth == n) {
            if (time > m) return;
            if (time <= m) answer = Math.max(answer, sum);
        } else {
            DFS(depth + 1, sum + ps[depth], time + pt[depth], ps, pt);
            DFS(depth + 1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        c최대점수구하기DFS T = new c최대점수구하기DFS();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 문제의 개수
        m = sc.nextInt(); // 제한 시간

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);


    }
}
