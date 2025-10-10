import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == one[i % one.length])
                cnt1++;
            if(answers[i] == two[i % two.length])
                cnt2++;
            if(answers[i] == three[i % three.length])
                cnt3++;
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        ArrayList<Integer> list = new ArrayList<>();
        if (cnt1 == max) list.add(1);
        if (cnt2 == max) list.add(2);
        if (cnt3 == max) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}