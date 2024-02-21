package level1;

public class Q21 {
//    양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
//    예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
//    자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        // Split
        String[] strArr = String.valueOf(x).split("");

        // 배열 각 자릿수 더하기
        for (String a : strArr) {
            sum += Integer.parseInt(a);
        }

        // x를 더한 값으로 나눈 나머지가 0이면 true 리턴
        if (x%sum==0) {
            return answer;
        } else {
            answer = false;
        }

        return answer;
    }
}