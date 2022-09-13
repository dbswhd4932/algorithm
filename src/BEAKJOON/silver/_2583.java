package BEAKJOON.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	128 MB	31386	17625	13940	56.632%
 */
public class _2583 {
    static int m; // 높이
    static int n; // 너비
    static int k; // 정사각형 개수
    static int[][] arr;
    static int count;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); // 높이
        n = sc.nextInt(); // 너비
        k = sc.nextInt();
        arr = new int[m][n];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int a = x1; a < x2; a++) {
                for (int b = y1; b < y2; b++) {
                    arr[b][a] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    count = 0;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    static void dfs(int x, int y) {
        arr[x][y] = 1;
        count++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if (arr[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
