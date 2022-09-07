package BEAKJOON.bronze;

import java.util.Scanner;

public class _1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[26];

        if(n < 5) {
            System.out.println("PREDAJA");
            return;
        }

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int num = str.charAt(0) - 'a';
            arr[num]++;
        }

        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 5 ) {
                check = true;
                char answer = (char) (i + 'a');
                System.out.print(answer);
            }
        }
        if(check == false) {
            System.out.println("PREDAJA");
        }
    }
}
