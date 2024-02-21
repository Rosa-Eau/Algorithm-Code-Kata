package level1;

public class Q18 {
//    문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

    public int solution(String s) {
        int answer = 0;

        if (s.substring(0).equals("-")) {
            answer = Integer.parseInt(s.substring(1,s.length()));
            answer *= (-1);
        } else {
            answer = Integer.parseInt(s);

        }

        return answer;
    }
}
