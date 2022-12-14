package DFS_BFS_활용;

import java.util.Scanner;

public class l섬나라아일랜드DFS {

    static int n;
    static int answer;
    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }

    public static void main(String[] args) {
        l섬나라아일랜드DFS T = new l섬나라아일랜드DFS();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    T.DFS(i,j,board);
                }
            }
        }

        System.out.println(answer);

    }

}
