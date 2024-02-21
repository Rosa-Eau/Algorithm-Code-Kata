package level1;

public class Q29 {
//    정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
//    단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.

    public int[] solution(int[] arr) {
        // 배열 길이 1일 때
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 배열 원소 중 최솟값 구하기
        int min = arr[0];
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }

        // 최솟값을 제외한 나머지 원소 저장하기
        int[] answer = new int[arr.length - 1];
        int i = 0;
        for (int a : arr) {
            if (a != min) {
                answer[i++] = a;
            }
        }

        return answer;
    }
}
