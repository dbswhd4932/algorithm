package Array;

/**
 *  풀이날짜 22.09.25
 *  걸린시간 00:05
 */

import java.util.ArrayList;
import java.util.Scanner;

public class a큰수출력하기 {
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            if ( arr[i+1] > arr[i]) {
                answer.add(arr[i+1]);
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
        for (Integer x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
