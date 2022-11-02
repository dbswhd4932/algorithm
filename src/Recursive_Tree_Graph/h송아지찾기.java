package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class h송아지찾기 {

    static int[] dis = {-1, 1, 5};
    static int[] check = new int[10001];

    public int BFS(int n, int m) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        queue.add(n);
        check[n] = 1;

        while (true) {
            int len = queue.size();
            answer++;
            for (int i = 0; i < len; i++) {
                Integer cur = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = cur + dis[j];
                    if (nx == m) return answer;
                    if (1 <= nx && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.add(nx);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        h송아지찾기 T = new h송아지찾기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(T.BFS(n, m));
    }
}
