package level1;

public class Q17 {
//    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//    예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int i = 0;

        while (n>0) {
            answer[i] = (int) (n%10);
            i++;
            n = n/10;
        }

        return answer;
    }
}
