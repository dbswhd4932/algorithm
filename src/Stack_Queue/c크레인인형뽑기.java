package Stack_Queue;

/**
 * 풀이날짜 22.10.19
 * 걸린시간 01:34
 */

import java.util.Scanner;
import java.util.Stack;

public class c크레인인형뽑기 {
    static int solution(int n, int[][] board, int m, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < m; i++) {
            int pos = arr[i] - 1;

            for (int j = 0; j < n; j++) {
                int num = board[j][pos];

                if (num != 0) {
                    if (stack.isEmpty()) {
                        stack.push(num);
                        board[j][pos] = 0;
                        break;
                    }
                    if (stack.peek() == num) {
                        stack.pop();
                        board[j][pos] = 0;
                        count += 2;
                    } else {
                        stack.push(num);
                        board[j][pos] = 0;
                    }
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, board, m, arr));
    }
}
