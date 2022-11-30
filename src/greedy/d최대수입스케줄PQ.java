package greedy;

import java.util.*;

class Lecture implements Comparable<Lecture> {
    int money;
    int date;

    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date;
    }
}

public class d최대수입스케줄PQ {

    static int n;

    public int solution(ArrayList<Lecture> arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Collections.sort(arr);
        int max = arr.get(0).date; // 3
        int answer = 0;
        int j = 0;

        for (int i = max; i > 0; i--) {
            for (; j < n; j++) {
                if (arr.get(j).date == i) pq.add(arr.get(j).money);
                else if (arr.get(j).date < i) break;
            }
            if (!pq.isEmpty()) answer += pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        d최대수입스케줄PQ T = new d최대수입스케줄PQ();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int date = sc.nextInt();
            arr.add(new Lecture(money, date));
        }

        System.out.println(T.solution(arr));

    }
}
