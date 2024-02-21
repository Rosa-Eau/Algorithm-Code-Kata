package level1;

import java.util.HashSet;
import java.util.Set;

public class Q28 {
//    0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//    numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아
//    더한 수를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int[] numbers) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int num : numbers) {
            set.add(num);
        }

        for (int i = 0; i < 10; i++) {
            if (set.add(i)) {
                answer += i;
            }
        }

        return answer;

    }
}
