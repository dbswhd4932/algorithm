package 프로그래머스.Lv2;

public class N개의최소공배수 {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 0; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a*b / gcd(a,b);
    }

    public static void main(String[] args) {
        N개의최소공배수 T = new N개의최소공배수();
        int [] arr = new int[]{2,6,8,14};
        System.out.println(T.solution(arr));
    }
}
