package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q49 {
//    정수 배열 numbers가 주어집니다.
//    numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
//    배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> numSet = new HashSet<>();
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    numSet.add(numbers[i]+numbers[j]);
                }
            }
        }
        answer = numSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return answer;
    }


}
