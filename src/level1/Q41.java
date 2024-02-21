package level1;

public class Q41 {
//    문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
//    각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//    각 단어의 짝수번째 알파벳은 대문자로,
//    홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int cnt = 0;

        for(String str : strArr) {

            if(str.contains(" ")){
                cnt = 0;
            } else {
                cnt++;
            }

            if(cnt%2==0){
                answer += str.toLowerCase();
            } else {
                answer += str.toUpperCase();
            }

        }

        return answer;
    }
}
