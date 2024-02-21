package level1;

public class Q12 {

//    정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

    public double solution(int[] arr) {
        double answer = 0;

        // 반복문 전부 더하고 그 값을 개수만큼 나눈다.
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer /= (arr.length);


        return answer;
    }


}
