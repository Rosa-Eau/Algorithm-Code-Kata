package level1;

public class Q22 {
//    두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.

    public long solution(int a, int b) {
        long answer = 0;

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (b < a){
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }

        return answer;

    }


//      등차수열의 합 공식을 통해 풀이
//    public long solution(int a, int b) {
//        return sumAtoB(Math.min(a, b), Math.max(b, a));
//    }
//
//    private long sumAtoB(long a, long b) {
//        return (b - a + 1) * (a + b) / 2;
//    }

}
