package Recursive_Tree_Graph;
/**
 * 풀이날짜 22.10.28
 * 걸린시간 00:03
 */
public class b재귀함수_이진수출력 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        b재귀함수_이진수출력 b재귀함수이진수출력 = new b재귀함수_이진수출력();
        b재귀함수이진수출력.DFS(11);
    }
}
