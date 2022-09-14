package BEAKJOON.silver;
/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 *  2 초	256 MB	52342	18278	13630	33.837%
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer,String> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String str = sc.next();
            map1.put(i,str);
            map2.put(str,i);
        }

        for (int i = 0; i < m; i++) {
            String str = sc.next();
            if ( 65 <= str.charAt(0) && str.charAt(0) <= 90 ) {
                System.out.println(map2.get(str));
            } else {
                System.out.println(map1.get(Integer.parseInt(str)));
            }
        }
    }
}
