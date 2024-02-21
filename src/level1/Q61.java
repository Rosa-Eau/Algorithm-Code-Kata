package level1;

import java.util.HashSet;
import java.util.Set;

public class Q61 {
//    로또의 최고 순위와 최저 순위

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int idx = 0;

        Set<Integer> minSet = new HashSet<>();
        Set<Integer> maxSet = new HashSet<>();

        for (int lotto : lottos) {
            if (lotto == 0) {
                idx++;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    minSet.add(winNum);
                    maxSet.add(winNum);
                }
            }
        }

        int max = maxSet.size() + idx;
        int min = minSet.size();

        for (int i = 0; i < 2; i++) {
            switch (max) {
                case 0, 1: answer[i] = 6; break;
                case 2: answer[i] = 5; break;
                case 3: answer[i] = 4; break;
                case 4: answer[i] = 3; break;
                case 5: answer[i] = 2; break;
                case 6: answer[i] = 1; break;
            }
            max = min;
        }

        return answer;
    }
}
