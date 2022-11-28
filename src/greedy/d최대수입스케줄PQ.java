package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int money;
    int time;

    public Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - this.time;
    }
}

public class d최대수입스케줄PQ {

    static int n = Integer.MIN_VALUE;
    static int max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).time < i) break;
                pq.add(arr.get(j).money);
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
            int time = sc.nextInt();
            arr.add(new Lecture(money, time));
            if (time > max) max = time;
        }

        System.out.println(T.solution(arr));

    }
}
