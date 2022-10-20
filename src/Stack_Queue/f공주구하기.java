package Stack_Queue;
/**
 * 풀이날짜 22.10.20
 * 걸린시간 00:06
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class f공주구하기 {
    static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                Integer num = queue.poll();
                queue.add(num);
            }
            queue.poll();
        }

        answer = queue.poll();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(n, k));

    }
}
