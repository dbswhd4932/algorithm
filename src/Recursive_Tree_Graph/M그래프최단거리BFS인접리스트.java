package Recursive_Tree_Graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 인접리스트
public class M그래프최단거리BFS인접리스트 {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.add(v);
        while (!queue.isEmpty()) {
            Integer cv = queue.poll();
            for (Integer nv : graph.get(cv)) {
                if ( ch[nv] == 0 ) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        M그래프최단거리BFS인접리스트 T = new M그래프최단거리BFS인접리스트();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //노드개수
        m = sc.nextInt(); //간선개수

        // 인접리스트
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n + 1]; // 체크배열
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
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


