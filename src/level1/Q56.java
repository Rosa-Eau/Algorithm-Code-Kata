package level1;

import java.util.Arrays;

public class Q56 {
//    한 상자에 사과를 m개씩 담아 포장합니다.
//    상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.
//    사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때,
//    과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        int n =score.length;

        for (int i = n - m; i >= 0; i -= m) {
            int min = score[i];
            answer += min * m;
        }

        return answer;
    }
}
