package DFS_BFS_활용;

import java.util.Scanner;

public class b바둑이승차DFS {
    static int c;
    static int n;
    static int answer;

    public void DFS(int depth, int sum, int[] arr) {
        if (sum > c ) return;
        if (depth == n) answer = Math.max(answer, sum);
        else {
            DFS(depth + 1, sum + arr[depth], arr);
            DFS(depth + 1, sum , arr);

        }
    }

    public static void main(String[] args) {
        b바둑이승차DFS T = new b바둑이승차DFS();
        Scanner sc = new Scanner(System.in);

        c = sc.nextInt(); //총합
        n = sc.nextInt(); //강아지 수

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}
