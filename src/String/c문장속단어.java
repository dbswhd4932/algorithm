package String;
/**
 *  풀이날짜 22.09.19
 *  걸린시간 00:19
 */
import java.util.Scanner;

public class c문장속단어 {
    public static String solution(String str) {
        String answer = "";
        String[] s = str.split(" ");

        int [] arr = new int [s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = s[i].length();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i]) {
                max = arr[i];
            }
        }
        int answerIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( max == arr[i]) {
                answerIdx = i;
                break;
            }
        }
        answer = s[answerIdx];

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
