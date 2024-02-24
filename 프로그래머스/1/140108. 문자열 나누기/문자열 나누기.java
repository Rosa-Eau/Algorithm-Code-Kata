class Solution {
    public int solution(String s) {
        int answer = 0;

        while (!s.isEmpty()) {
            answer++;

            char x = s.charAt(0);
            int countX = 1;
            int countOther = 0;
            for (int i = 1; i < s.length(); i++) {
                if (x == s.charAt(i))
                    countX++;
                else
                    countOther++;

                if (countX == countOther)
                    break;
            }

            s = s.substring(countX + countOther);
        }

        return answer;
    }
}