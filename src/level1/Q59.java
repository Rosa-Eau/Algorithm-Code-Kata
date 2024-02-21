package level1;

public class Q59 {
//  덧칠하기

    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int[] walls = new int[n];

        for (int sec : section) {
            walls[sec-1] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (walls[i] == 1) {
                answer++;
                i = i + m - 1;
            }
        }

        return answer;
    }
}
