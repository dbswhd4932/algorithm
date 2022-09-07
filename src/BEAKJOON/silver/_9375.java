package BEAKJOON.silver;

import java.util.HashMap;
import java.util.Scanner;

public class _9375 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                sc.next();
                String str = sc.next();
                String[] s = str.split(" ");
                map.put(s[0] , map.getOrDefault(s[0], 0) + 1);
            }
            int answer = 1;
            for (Integer value : map.values()) {
                answer = answer * (value+1);
            }
            System.out.println( answer -1);
            map.clear();
        }
    }
}
