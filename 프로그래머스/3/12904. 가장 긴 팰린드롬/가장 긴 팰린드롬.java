class Solution {
    public int solution(String s) {
        int answer = 0;

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            answer = Math.max(answer, palindromeSize(s, i - 1, i + 1));
            answer = Math.max(answer, palindromeSize(s, i, i + 1));
        }

        return answer;
    }

    private int palindromeSize(String s, int first, int last) {

        while (first >= 0 && last < s.length() && s.charAt(first) == s.charAt(last)) {
            first--;
            last++;
        }

        while (last == s.length() && first >= 0 && s.charAt(first) == s.charAt(last - 1)) {
            first--;
        }

        while (first == -1 && last < s.length() && s.charAt(0) == s.charAt(last)) {
            last++;
        }

        return last - first - 1;
    }
}