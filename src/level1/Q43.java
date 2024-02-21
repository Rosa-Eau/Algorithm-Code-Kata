package level1;

public class Q43 {
//    숫자로 이루어진 문자열 t와 p가 주어질 때,
//    t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가
//    p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

    public int solution(String t, String p) {
        int answer = 0;
        long longP = Long.parseLong(p);

        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            int end = i + p.length();
            String strT = t.substring(i, end);
            long longT = Long.parseLong(strT);
            if (longT <= longP) {
                answer++;
            }
        }

        return answer;
    }
}
