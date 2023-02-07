package 프로그래머스.Lv1;

public class Test {

    public int solution(int n, int[] v) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = 0;

        // 최대값으로 팔기
        for (int i = 0; i < n; i++) {
            if (max < v[i]) {
                max = v[i];
                index = i;
            }
        }

        // 최소값으로 사기
        for (int i = index; i < n; i++) {
            if (min > v[i]) {
                min = v[i];
            }
        }

        if (index + 1 == n) {
            int max2 = 0;
            for (int i = 0; i < n - 1; i++) {
                if (max2 < v[i]) {
                    max2 = v[i];
                }
            }
            answer = max2 - max;
            return answer;
        }

        answer = max - min;
        return answer;
    }

    public static void main(String[] args) {
        Test T = new Test();
        System.out.println(T.solution(10, new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3}));
        System.out.println(T.solution(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(T.solution(6, new int[]{4, 1, 7, 6, 5, 2}));
    }
}
