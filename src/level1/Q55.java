package level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q55 {
//    문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때,
//    cards1과 cards2에 적힌 단어들로 goal를 만들 수 있다면 "Yes"를,
//    만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));

        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(q1.peek())) {
                q1.poll();
            } else if (goal[i].equals(q2.peek())) {
                q2.poll();
            } else {
                answer = "No";
            }
        }

        return answer;
    }
}
