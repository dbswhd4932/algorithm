package DFS_BFS_활용;

import java.util.Scanner;

public class i미로탐색DFS {
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if ( nx >= 1 && ny >= 1 && nx < 8 && ny < 8 && arr[nx][ny] == 0 ) {
                    arr[nx][ny] = 1;
                    DFS(nx,ny);
                    arr[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        i미로탐색DFS T = new i미로탐색DFS();

        Scanner sc = new Scanner(System.in);
        arr = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        arr[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);

    }
}
