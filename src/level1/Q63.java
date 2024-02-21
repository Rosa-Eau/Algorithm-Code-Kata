package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q63 {
//    두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여
//    만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다).
//    X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
//    두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        // X, Y 비교 같은 값 전부 구함
        for (String x : X.split("")) {
            for (String y : Y.split("")) {
                if (x.equals(y)) {
                    if (X.length() > Y.length()) {
                        sb.append(x);
                        X = X.replaceFirst(x, "");
                    } else {
                        sb.append(y);
                        Y = Y.replaceFirst(y, "");
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < sb.length(); i++) {
            String str = sb.substring(i, i+1);
            list.add(Integer.parseInt(str));
        }

        // 나온 수 내림차순 정렬
        list.sort(Collections.reverseOrder());

        // list 예외처리
        if (list.isEmpty()) {
            list.add(-1);
        }

        // answer에 답 넣기
        for (Integer integer : list) {
            answer += integer.toString();
        }

        if (answer.isEmpty()) {
            answer = "-1";
        }
        if (answer.replace("0", "") == "") {
            answer = "0";
        }

        return answer;
    }
}
