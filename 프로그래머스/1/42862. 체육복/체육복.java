import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> lostList = new ArrayList<>();
        List<Integer> resList = new ArrayList<>();

        for (int l : lost){
            lostList.add(l);
        }

        for (int r : reserve){
            resList.add(r);
        }

        Collections.sort(lostList);
        Collections.sort(resList);

        List<Integer> remove = new ArrayList<>();

        for (int l : lostList) {
            if (resList.contains(l)) {
                remove.add(l);
            }
        }

        lostList.removeAll(remove);
        resList.removeAll(remove);

        for (int r : resList) {
            if (lostList.contains(r - 1)) {
                lostList.remove(Integer.valueOf(r - 1));
            } else if (lostList.contains(r + 1)) {
                lostList.remove(Integer.valueOf(r + 1));
            }
        }

        return answer = n - lostList.size();
    }
}