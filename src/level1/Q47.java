package level1;

import java.util.Arrays;
import java.util.Comparator;

public class Q47 {
//    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
//    각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
//    예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면
//    각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char char1 = (o1.length() > n) ? o1.charAt(n) : 0; // 예외 처리
                char char2 = (o2.length() > n) ? o2.charAt(n) : 0; // 예외 처리

                int result = Character.compare(char1, char2);
                return (result != 0) ? result : o1.compareTo(o2);
            }
        });


        return strings;
    }
}
