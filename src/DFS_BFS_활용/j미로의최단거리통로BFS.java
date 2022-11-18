package DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    public int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class j미로의최단거리통로BFS {

    static int[][] board;
    static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};


    public void BFS(int x, int y) {
        Queue<Point2> queue = new LinkedList<>();
        queue.add(new Point2(x, y));
        board[x][y] = 1; // 출발점 체크
        while (!queue.isEmpty()) {
            Point2 cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx >= 1 && ny >= 1 && nx < 8 && ny < 8 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.add(new Point2(nx,ny));
                    dis[nx][ny] = dis[cur.x][cur.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        j미로의최단거리통로BFS T = new j미로의최단거리통로BFS();
        Scanner sc = new Scanner(System.in);

        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        T.BFS(1,1);
        if ( dis[7][7] == 0 ) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
