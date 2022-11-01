package Recursive_Tree_Graph;

public class f부분집합구하기 {
    static int n;
    static int[] ch;

    public void DFS(int depth) {
        if (depth == n + 1) {
            for (int i = 1; i < depth; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[depth] = 1;
            DFS(depth + 1);
            ch[depth] = 0;
            DFS(depth + 1);
        }
    }

    public static void main(String[] args) {
        f부분집합구하기 T = new f부분집합구하기();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
