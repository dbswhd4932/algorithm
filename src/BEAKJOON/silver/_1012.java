package BEAKJOON.silver;

import java.util.Scanner;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	512 MB	120501	47008	31813	37.033%
 */
public class _1012 {

    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n; // 가로
    static int m; // 세로
    static int k; // 배추개수
    static int count; // 지렁이 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스

        for (int i = 0; i < t; i++) {
            count = 0;
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n][m];

            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y] = 1;
            }

            // 배열중에 1이 있으면 dfs 시작
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (arr[j][l] == 1) {
                        dfs(j, l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 조건 확인
            if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
                // 조건에 만족하면 0으로 바꿔주고 다시 dfs
                arr[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }
}


