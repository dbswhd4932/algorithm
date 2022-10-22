package Stack_Queue;
/**
 * 풀이날짜 22.10.22
 * 걸린시간 00:40
 */
import java.util.*;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class h응급실 {

    static int solution(int n, int m, int[] arr) {
        Queue<Person> queue = new LinkedList<>();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            queue.add(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person person : queue) {
                if ( person.priority > tmp.priority) {
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null ){ // 진료가능
                answer++;
                if ( tmp.id == m ) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
