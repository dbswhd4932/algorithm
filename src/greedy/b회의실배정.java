package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 끝나는 시간을 기준으로 정렬한다.
class Room implements Comparable<Room> {
    int s;
    int e;

    public Room(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Room o) {
        if (this.e == o.e) {
            return this.s - o.s;
        }
        return this.e - o.e;
    }
}

public class b회의실배정 {

    public int solution(ArrayList<Room> arr) {
        Collections.sort(arr);
        int cnt = 1;
        int endTime = arr.get(0).e;

        for (int i = 1; i < arr.size(); i++) {
            if (endTime <= arr.get(i).s) {
                cnt++;
                endTime = arr.get(i).e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        b회의실배정 T = new b회의실배정();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Room> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Room(s, e));
        }
        System.out.println(T.solution(arr));

    }
}
