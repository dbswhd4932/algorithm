package Recursive_Tree_Graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 인접리스트
public class M그래프최단거리BFS {

    static int n, m;
    static int[] ch;
    static int[] level;
    static int[][] arr;

    public void BFS(int v) {
        int depth = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        ch[v] = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Integer x = queue.poll();
                level[x] = depth;
                for (int j = 0; j <= n; j++) {
                    if (ch[j] == 0 && arr[x][j] == 1) {
                        ch[j] = 1;
                        queue.add(j);
                    }
                }
            }
            depth++;
        }
    }

    public static void main(String[] args) {
        M그래프최단거리BFS T = new M그래프최단거리BFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //노드개수
        m = sc.nextInt(); //간선개수

        ch = new int[n + 1]; // 체크배열
        level = new int[n + 1];
        arr = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + level[i]);
        }
    }
}
//6 9
//1 3
//1 4
//2 1
//2 5
//3 4
//4 5
//4 6
//6 2
//6 5


