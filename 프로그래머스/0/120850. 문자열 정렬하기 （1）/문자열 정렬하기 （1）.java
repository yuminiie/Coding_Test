import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch >= '0' && '9' >= ch){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int count = 0;
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch >= '0' && '9' >= ch){
                answer[count] = ch - '0';;
                count++;
            }
        }
            Arrays.sort(answer);
        return answer;
    }
}