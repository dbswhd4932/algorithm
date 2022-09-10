package BEAKJOON.silver;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  1 초	192 MB	134286	57493	37002	41.532%
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2178 {

    static int n;
    static int m;
    static int[][] arr;
    static int[][] cnt;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<point> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][m];
        cnt = new int[n][m];

        // 미로 입력받기
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        bfs(0, 0);
    }

    static void bfs(int x, int y) {
        arr[0][0] = 1;
        q.add(new point(x, y));

        while (!q.isEmpty()) {
            point cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
                    q.offer(new point(nx, ny));
                    arr[nx][ny] = 0;
                    cnt[nx][ny] = cnt[cur.x][cur.y] + 1;

                    if (arr[nx][ny] == arr[n - 1][m - 1]) {
                        System.out.println(cnt[nx][ny] +1 );
                        return;
                    }
                }
            }
        }
    }

    static class point {
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
