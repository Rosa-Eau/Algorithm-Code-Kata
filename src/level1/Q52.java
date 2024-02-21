package level1;

public class Q52 {
//    콜라 문제

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n / a > 0){
            answer += (n / a) * b;
            n = (n / a) * b + n % a;
        }

        return answer;
    }
}
