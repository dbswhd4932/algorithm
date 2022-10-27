package sorting;
/**
 * 풀이날짜 22.10.27
 * 걸린시간 00:7
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class f장난꾸러기 {
    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int [] checkArr = new int [n];
        for (int i = 0; i < n; i++) {
            checkArr[i] = arr[i];
        }
        Arrays.sort(checkArr);

        for (int i = 0; i < n; i++) {
            if ( checkArr[i] != arr[i]) {
                answer.add(i+1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int answer : solution(n, arr)) {
            System.out.print(answer + " ");
        }

    }
}
