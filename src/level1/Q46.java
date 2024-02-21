package level1;

public class Q46 {
//    1478 → "one4seveneight"
//    234567 → "23four5six7"
//    10203 → "1zerotwozero3"

//    숫자의 일부 자릿수가 영단어로 바뀌어졌거나,
//    혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
//    s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

    public int solution(String s) {
        int answer = 0;

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < str.length; i++) {
            String num = i + "";
            s = s.replace(str[i], num);
        }

        answer = Integer.parseInt(s);

        return answer;
    }

}
