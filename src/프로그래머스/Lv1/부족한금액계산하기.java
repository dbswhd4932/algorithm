package 프로그래머스.Lv1;

public class 부족한금액계산하기 {

    public long solution(long price, long money, long count) {
        long answer = 0;
        long moneyCopy = money;
        long priceTotal = 0;

        for (int i = 1; i <= count; i++) {
            money -= price * i;
            priceTotal += price * i;
        }
        if (money < 0) {
            answer = priceTotal - moneyCopy;
        } else {
            answer = 0;
        }
        return answer;
    }
}
