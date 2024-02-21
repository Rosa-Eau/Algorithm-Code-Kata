package level1;

import java.util.Arrays;

public class Q20 {
//    함수 solution은 정수 n을 매개변수로 입력받습니다.
//    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//    예를들어 n이 118372면 873211을 리턴하면 됩니다.

    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}
