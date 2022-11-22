package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    int h;
    int w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h; // 내림차순
    }
}

public class a씨름선수 {
    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body body : arr) {
            if ( max < body.w) {
                cnt ++;
                max = body.w;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        a씨름선수 T = new a씨름선수();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));

    }
}
