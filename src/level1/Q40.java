package level1;

public class Q40 {
//    자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
//    이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int n) {
        String str = "";
        while(n > 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);

    }
}
