package BEAKJOON.silver;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class _9996 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        String[] split = str.split("\\*");

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String answer = "DA";

            if (str.length() - 1 > s.length()) {
                answer = "NE";
            }

            for (int j = 0; j < split[0].length(); j++) {
                if (s.charAt(j) != split[0].charAt(j)) {
                    answer = "NE";
                    break;
                }
            }

            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            StringBuilder sb2 = new StringBuilder(split[1]);
            sb2.reverse();

            for (int j = 0; j < sb2.length(); j++) {
                if (sb.charAt(j) != sb2.charAt(j)) {
                    answer = "NE";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
