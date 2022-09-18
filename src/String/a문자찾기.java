package String;

import java.util.Scanner;

public class a문자찾기 {
    public static int solution(String str, char t) {
        int count = 0;

        String[] s = str.split("");
        for (int i = 0; i < s.length; i++) {
            if(s[i].equalsIgnoreCase(String.valueOf(t))) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.println(solution(str, t));
    }
}
