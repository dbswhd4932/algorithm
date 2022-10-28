package Recursive_Tree_Graph;
/**
 * 풀이날짜 22.10.28
 * 걸린시간 00:40
 */
public class a재귀함수_스택프레임 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        a재귀함수_스택프레임 T = new a재귀함수_스택프레임();
        T.DFS(3);
    }
}
