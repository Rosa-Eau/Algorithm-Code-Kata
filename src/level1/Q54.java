package level1;

public class Q54 {
//    2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
//    두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
//    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

    public String solution(int a, int b) {
        String answer = "";
        int m = 0;

        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        for (int i = 1; i < a; i++) {
            boolean month31 = (i <= 7 && i % 2 == 1) || (i > 7 && i % 2 == 0);
            boolean month30 = (i > 7 && i % 2 == 1) || (i <= 7 && i % 2 == 0);
            if (i != 2) {
                if (month31) {
                    m += 31;
                } else if (month30) {
                    m += 30;
                }
            } else {
                m += 29;
            }
        }

        int d = (m+b)%7-1;

        if (d == -1) {
            d = 6;
        }
        answer = week[d];

        return answer;
    }
}
