package 프로그래머스.Lv1;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = 0;
                    boolean check = false;
                    sum = nums[i] + nums[j] + nums[k];
                    for (int l = 2; l < sum; l++) {
                        if (sum % l == 0) check = true;
                    }
                    if (!check) answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수만들기 T = new 소수만들기();
        System.out.println(T.solution(new int[]{1, 2, 3, 4}));
        System.out.println(T.solution(new int[]{1, 2, 7, 6, 4}));
    }
}
