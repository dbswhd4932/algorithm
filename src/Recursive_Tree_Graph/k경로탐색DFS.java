package Recursive_Tree_Graph;


import java.util.Scanner;

//인접행렬로 풀이  정점의개수가 많으면 비효율적
public class k경로탐색DFS {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        k경로탐색DFS T = new k경로탐색DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //노드개수
        m = sc.nextInt(); //간선개수
        graph = new int[n + 1][n + 1]; // 1 ~ n
        ch = new int[n + 1]; // 체크배열
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1; // a -> b
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}

//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5
