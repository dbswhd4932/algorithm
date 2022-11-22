package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point6 implements Comparable<Point6> {
    int x;
    int y;

    public Point6(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point6 o) {
        if (this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}

public class h좌표정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Point6> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point6(x, y));
        }

        Collections.sort(arr);

        for (Point6 point6 : arr) {
            System.out.print(point6.x + " " + point6.y);
            System.out.println();
        }
    }
}
