package BEAKJOON.silver;

import java.util.Scanner;

public class _2468 {
    static int n;
    static int[][] arr;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        max = 1;
        for (int i = 1; i < 101; i++) {
            count = 0;
            board = new int[n][n];
            visited = new boolean[n][n];

            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (arr[a][b] <= i) {
                        board[a][b] = 1;
                    }
                }
            }

            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (board[a][b] == 0 && !visited[a][b]) {
                        dfs(a, b);
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (board[nx][ny] == 0 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
