import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        for (int i : delete_list) set.add(i);

        int cnt = 0;
        for (int i : arr) {
            if (!set.contains(i)) cnt++;
        }

        int[] answer = new int[cnt];
        int idx = 0;
        for (int i : arr) {
            if (!set.contains(i)) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}
