package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int time;
    char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class c결혼식 {
    public int solution(ArrayList<Time> arr) {
        Collections.sort(arr);
        int answer = Integer.MIN_VALUE;
        int cnt = 0;

        for (Time time : arr) {
            if (time.state == 's') cnt ++;
            else cnt --;

            if ( cnt > answer) answer = cnt;
        }
        return answer;

    }


    public static void main(String[] args) {
        c결혼식 T = new c결혼식();
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> arr = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Time(s, 's'));
            arr.add(new Time(e, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
