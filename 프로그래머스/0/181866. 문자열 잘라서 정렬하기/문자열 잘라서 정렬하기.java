import java.util.*;


class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        String[] answer = new String[st.countTokens()];
        int cnt = 0;
        while(st.hasMoreTokens()){
            answer[cnt] = st.nextToken();
            cnt++;
        }
        Arrays.sort(answer);
        return answer;
    }
}