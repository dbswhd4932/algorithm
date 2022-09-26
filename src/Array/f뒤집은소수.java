package Array;
/**
 *  풀이날짜 22.09.26
 *  걸린시간 00:14
 */
import java.util.ArrayList;
import java.util.Scanner;

public class f뒤집은소수 {
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] reverseArr = new int[n];
        for (int i = 0; i < n; i++) {
            int rev = 0;
            while (arr[i] > 0) {
                rev = rev * 10 + arr[i] % 10;
                arr[i] = arr[i] / 10;
            }
            reverseArr[i] = rev;
        }

        for (int i = 0; i < reverseArr.length; i++) {
            if(isPrime(reverseArr[i]) == true) {
                answer.add(reverseArr[i]);
            }
        }
        return answer;
    }

    static boolean isPrime(int num) {
        if ( num == 1 ) return false;
        for (int i = 2; i < num; i++) {
            if ( num % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int answer : solution(n, arr)) {
            System.out.print(answer + " ");
        }
    }
}
