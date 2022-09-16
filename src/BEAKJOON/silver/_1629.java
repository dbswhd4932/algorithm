package BEAKJOON.silver;

import java.util.Scanner;

public class _1629 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        System.out.println(cal(a,b,c) % c);
    }
    static long cal(long a, long b, long c) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else if (b % 2 == 0) {
            long n = cal(a, b / 2, c);
            return (n * n) % c;
        } else if (b % 2 == 1) {
            long n = cal(a, b / 2, c);
            return (((n * n) % c) * a) % c;
        }
        return a;
    }
}
