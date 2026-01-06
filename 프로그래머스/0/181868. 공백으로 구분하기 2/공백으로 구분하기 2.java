import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        
        String[] answer = new String[st.countTokens()];
        int count = 0;
        
        while(st.hasMoreTokens()){
            answer[count++] = st.nextToken();
        }
        
        return answer;
    }
}