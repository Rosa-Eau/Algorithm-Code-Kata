package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q57 {
//            1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//            2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//            3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

//            1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
//            가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;

        int[] st1 = new int[answers.length];
        int[] st2 = new int[answers.length];
        int[] st3 = new int[answers.length];
        int cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            cnt++;
            if (cnt == 6) {
                cnt = 1;
            }
            st1[i] = cnt;
        }

        cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (i % 2 == 0) {
                st2[i] = 2;
            } else {
                cnt++;
                if (cnt == 5) {
                    cnt = 1;
                }
                System.out.println(cnt);
                switch (cnt) {
                    case 1:
                        st2[i] = 1;
                        break;
                    case 2:
                        st2[i] = 3;
                        break;
                    case 3:
                        st2[i] = 4;
                        break;
                    case 4:
                        st2[i] = 5;
                        break;
                }
            }
        }

        cnt = 0;

        for (int i = 0; i < answers.length; i = i + 2) {
            cnt++;
            if (cnt == 6) {
                cnt = 1;
            }
            switch (cnt) {
                case 1:
                    st3[i] = 3;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 3;
                    break;
                case 2:
                    st3[i] = 1;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 1;
                    break;
                case 3:
                    st3[i] = 2;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 2;
                    break;
                case 4:
                    st3[i] = 4;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 4;
                    break;
                case 5:
                    st3[i] = 5;
                    if (i == answers.length - 1) {
                        break;
                    }
                    st3[i + 1] = 5;
                    break;
            }
        }

        String stu1 = Arrays.toString(st1);
        String stu2 = Arrays.toString(st2);
        String stu3 = Arrays.toString(st3);

        System.out.println(stu1 + stu2 + stu3);


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == st1[i]) {
                correct1++;
            }
            if (answers[i] == st2[i]) {
                correct2++;
            }
            if (answers[i] == st3[i]) {
                correct3++;
            }
        }

        int maxScore = Math.max(correct1, Math.max(correct2, correct3));
        if (maxScore == correct1) {
            answer.add(1);
        }
        if (maxScore == correct2) {
            answer.add(2);
        }
        if (maxScore == correct3) {
            answer.add(3);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
