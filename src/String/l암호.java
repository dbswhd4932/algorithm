package String;

/**
 * 풀이날짜 22.09.23
 * 걸린시간 00:20
 */


import java.util.Scanner;

public class l암호 {
    public static String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String subStr = s.substring(0, 7).replace('#', '1')
                            .replace('*', '0');

            int num = Integer.parseInt(subStr, 2);
            System.out.println(num);
            answer += (char)num;

            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }
}

/**
 * #****##
 * #**####
 * #**####
 * #**##**
 */