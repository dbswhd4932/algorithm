package Recursive_Tree_Graph;
/**
 * 풀이날짜 22.10.28
 * 걸린시간 00:15
 */
public class c팩토리얼 {
    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        c팩토리얼 c팩토리얼 = new c팩토리얼();
        System.out.println(c팩토리얼.DFS(5));
    }
}
